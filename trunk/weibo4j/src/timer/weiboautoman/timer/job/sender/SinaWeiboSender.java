package weiboautoman.timer.job.sender;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weibo4j.Status;
import weibo4j.Weibo;
import weibo4j.WeiboException;
import weiboautoman.timer.dataobject.vo.UsersTimeMsgVO;
import weiboautoman.timer.util.StringUtil;

/**
 * 类SinaWeiboSender.java的实现描述：新浪微博发送实现类
 * 
 * @author fenglibin 2011-10-18 上午08:51:24
 */
public class SinaWeiboSender extends WeiboSender {

    private static Logger       log             = LoggerFactory.getLogger(SinaWeiboSender.class);
    /** 新浪微博的标识 */
    private static final String SINA_WEIBO_MARK = "S";

    @Override
    public Status send(UsersTimeMsgVO msgVO) {
        Status status = null;
        String type = super.getWeiboType(msgVO);
        if (type.indexOf(SINA_WEIBO_MARK) < 0) {
            return status;
        }

        try {
            Weibo weibo = new Weibo();
            weibo.setToken(msgVO.getToken(), msgVO.getTokenSecret());
            if (!StringUtil.isNull(msgVO.getMsgPicture())) {// 带图片的微博
                status = weibo.uploadStatus(msgVO.getMsgContent(),
                                            new File(super.getImagePath() + msgVO.getMsgPicture()));
            } else {
                status = weibo.updateStatus(msgVO.getMsgContent());
            }
            if (!status.equals(Boolean.TRUE)) {
                if (log.isWarnEnabled()) {
                    log.warn("发送微博失败：" + status.getText());
                }
            }
        } catch (WeiboException e) {
            if (log.isErrorEnabled()) {
                log.error("发送微博失败：" + getErrText(status) + ".", e);
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error("发送微博失败：" + e.getMessage(), e);
            }
        }

        return status;
    }

    private String getErrText(Status s) {
        if (s == null) {
            return "";
        } else {
            return s.getText();
        }
    }

}
