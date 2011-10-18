package weiboautoman.timer.job;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weibo4j.Status;
import weibo4j.Weibo;
import weibo4j.WeiboException;
import weiboautoman.timer.bo.UsersTimeMsgBO;
import weiboautoman.timer.core.Constants;
import weiboautoman.timer.dao.UsersTimeMsgDAO;
import weiboautoman.timer.dataobject.vo.UsersTimeMsgVO;
import weiboautoman.timer.util.NumberUtil;
import weiboautoman.timer.util.StringUtil;

/**
 * 类WeiboSenderThread.java的实现描述：发送微博的线程
 * 
 * @author fenglibin 2011-10-6 下午03:00:18
 */
public class WeiboSenderThread implements Runnable {

    private static Logger   log = LoggerFactory.getLogger(WeiboSenderThread.class);
    int                     userIdFirstNumber;
    private UsersTimeMsgDAO usersTimeMsgDAO;
    private UsersTimeMsgBO  usersTimeMsgBO;
    private String          imagePath;

    @Override
    public void run() {
        long totalCount = usersTimeMsgDAO.selectByUserIdFirstNumberLikeCount(String.valueOf(userIdFirstNumber));
        long pages = NumberUtil.getPages(totalCount, Constants.DEFAULT_PAGE_SIZE);
        if (log.isWarnEnabled()) {
            log.warn("userIdFirstNumber:" + userIdFirstNumber + " get totalCount:" + totalCount + " ,pages:" + pages);
        }
        for (long currentPage = 1; currentPage <= pages; currentPage++) {
            long start = (currentPage - 1) * Constants.DEFAULT_PAGE_SIZE;
            List<UsersTimeMsgVO> timeWeiboList = usersTimeMsgDAO.selectByUserIdFirstNumberLike(String.valueOf(userIdFirstNumber),
                                                                                               start,
                                                                                               Constants.DEFAULT_PAGE_SIZE);
            if (timeWeiboList != null && timeWeiboList.size() > 0) {
                for (UsersTimeMsgVO msgVO : timeWeiboList) {
                    sendWeibo(msgVO);
                }
            }
        }

    }

    /**
     * 发送一条微博，在发送成功后，更新当前记录的状态为已发送
     * 
     * @param msgVO
     */
    private void sendWeibo(UsersTimeMsgVO msgVO) {
        try {
            if (log.isWarnEnabled()) {
                log.warn("start send weibo to token:" + msgVO.getToken() + ",token secret:" + msgVO.getTokenSecret());
            }
            boolean result = doSend(msgVO);
            if (result) {
                if (log.isWarnEnabled()) {
                    log.warn("send weibo to token:" + msgVO.getToken() + ",token secret:" + msgVO.getTokenSecret()
                             + " success.");
                }
                usersTimeMsgBO.updateUserTimeMsgSendStatus(msgVO.getId());
            } else {
                if (log.isWarnEnabled()) {
                    log.warn("send weibo to token:" + msgVO.getToken() + ",token secret:" + msgVO.getTokenSecret()
                             + " fail.");
                }
            }
        } catch (WeiboException e) {
            if (log.isErrorEnabled()) {
                log.error("发送微博发生异常1:" + msgVO.toString(), e);
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error("发送微博发生异常2:" + msgVO.toString(), e);
            }
        }
    }

    /**
     * 执行发送的动作
     * 
     * @param msgVO
     * @return
     * @throws WeiboException
     */
    private boolean doSend(UsersTimeMsgVO msgVO) throws WeiboException {
        boolean success = Boolean.FALSE;
        Weibo weibo = new Weibo();
        weibo.setToken(msgVO.getToken(), msgVO.getTokenSecret());
        Status status = null;
        if (!StringUtil.isNull(msgVO.getMsgPicture())) {// 带图片的微博
            status = weibo.uploadStatus(msgVO.getMsgContent(), new File(imagePath + msgVO.getMsgPicture()));
        } else {
            status = weibo.updateStatus(msgVO.getMsgContent());
        }
        if (status.equals(Boolean.TRUE)) {
            success = Boolean.TRUE;
        } else {
            if (log.isWarnEnabled()) {
                log.warn("发生微博失败：" + status.getText());
            }
        }

        return success;
    }

    public WeiboSenderThread clone() {
        WeiboSenderThread thread = new WeiboSenderThread();
        thread.usersTimeMsgBO = usersTimeMsgBO;
        thread.usersTimeMsgDAO = usersTimeMsgDAO;
        thread.imagePath = imagePath;
        return thread;
    }

    public void setUserIdFirstNumber(int userIdFirstNumber) {
        this.userIdFirstNumber = userIdFirstNumber;
    }

    public void setUsersTimeMsgDAO(UsersTimeMsgDAO usersTimeMsgDAO) {
        this.usersTimeMsgDAO = usersTimeMsgDAO;
    }

    public void setUsersTimeMsgBO(UsersTimeMsgBO usersTimeMsgBO) {
        this.usersTimeMsgBO = usersTimeMsgBO;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

}
