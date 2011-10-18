package weiboautoman.timer.job;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weibo4j.WeiboException;
import weiboautoman.timer.bo.UsersTimeMsgBO;
import weiboautoman.timer.core.Constants;
import weiboautoman.timer.dao.UsersTimeMsgDAO;
import weiboautoman.timer.dataobject.vo.UsersTimeMsgVO;
import weiboautoman.timer.job.sender.WeiboSender;
import weiboautoman.timer.util.NumberUtil;

/**
 * 类WeiboSenderThread.java的实现描述：发送微博的线程
 * 
 * @author fenglibin 2011-10-6 下午03:00:18
 */
public class WeiboSenderThread implements Runnable, Cloneable {

    private static Logger     log = LoggerFactory.getLogger(WeiboSenderThread.class);
    int                       userIdFirstNumber;
    private UsersTimeMsgDAO   usersTimeMsgDAO;
    private UsersTimeMsgBO    usersTimeMsgBO;
    private String            imagePath;
    private List<WeiboSender> weiboSender;

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
     * 执行发送的动作。如果涉及到多个同条消息要发送到多个微博，只要有一种发送成功了，就认为是发送成功了
     * 
     * @param msgVO
     * @return 返回微博发送的结果
     * @throws WeiboException
     */
    private boolean doSend(UsersTimeMsgVO msgVO) throws WeiboException {
        boolean success = Boolean.FALSE;
        for (WeiboSender sender : weiboSender) {
            boolean sendResutl = sender.send(msgVO);
            if (!success) {
                /** 这里有可能涉及到同一条消息要发送到多种微博，如新浪微博、QQ微博等，其中有可能有发送失败的，这里默认只要有一个发送成功，就默认为发送成功了 */
                success = sendResutl;
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

    public void setWeiboSender(List<WeiboSender> weiboSender) {
        this.weiboSender = weiboSender;
    }

}
