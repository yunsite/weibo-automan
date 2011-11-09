package weiboautoman.timer.job.sender;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weibo4j.Status;
import weibo4j.Weibo;
import weibo4j.WeiboException;
import weibo4j.http.ImageItem;
import weiboautoman.timer.core.Constants;
import weiboautoman.timer.core.SendResult;
import weiboautoman.timer.dataobject.vo.UsersTimeMsgVO;
import weiboautoman.timer.util.ImageUtil;
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
    public SendResult send(UsersTimeMsgVO msgVO) {
        SendResult result = null;
        String type = super.getWeiboType(msgVO);
        if (type.indexOf(SINA_WEIBO_MARK) < 0) {
            return result;
        }
        result = new SendResult();
        Status status = null;
        try {
            Weibo weibo = new Weibo();
            weibo.setToken(msgVO.getToken(), msgVO.getTokenSecret());

            if (!StringUtil.isNull(msgVO.getMsgPicture())) {// 带图片的微博
                if (msgVO.getMsgPicture().startsWith("http")) {// 网络图片
                    ImageItem imageItem = ImageUtil.readImageItem(msgVO.getMsgPicture());
                    status = weibo.uploadStatus(msgVO.getMsgContent(), imageItem);
                } else {
                    status = weibo.uploadStatus(msgVO.getMsgContent(), new File(getImagePath() + msgVO.getMsgPicture()));

                }
            } else {
                status = weibo.updateStatus(msgVO.getMsgContent());
            }
            if (status.getResponse().getStatusCode() == Constants.HTTP_OK_RESPONSE
                || status.getResponse().getStatusCode() == Constants.REPEAT_MESSAGE_ERR_CODE) {
                result.setSuccess(Boolean.TRUE);
            } else {
                result.setReason("发送微博失败,返回状态码:" + status.getResponse().getStatusCode());
            }
        } catch (WeiboException e) {
            if (log.isErrorEnabled()) {
                log.error("发送微博失败1：" + e.getMessage(), e);
            }
            if (e.getStatusCode() == Constants.REPEAT_MESSAGE_ERR_CODE) {
                result.setSuccess(Boolean.TRUE);
            } else {
                result.setReason("发送微博失败发生异常,错误码:" + e.getStatusCode() + ",错误信息" + e.getMessage());
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error("发送微博失败2：" + e.getMessage(), e);
            }
            result.setReason("发送微博失败发生异常,"
                             + (status != null ? "状态码:" + status.getResponse().getStatusCode() : "错误信息"
                                                                                                 + e.getMessage()));
        }
        return result;
    }
}
