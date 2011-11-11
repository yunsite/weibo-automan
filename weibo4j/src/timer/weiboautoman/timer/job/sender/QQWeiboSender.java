package weiboautoman.timer.job.sender;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.tencent.weibo.api.Fav_API;
import com.tencent.weibo.api.Private_API;
import com.tencent.weibo.beans.OAuth;
import com.tencent.weibo.utils.OAuthClient;
import com.tencent.weibo.utils.WeiBoConst;

import weiboautoman.timer.core.SendResult;
import weiboautoman.timer.dataobject.vo.UsersTimeMsgVO;

/**
 * 类QQWeiboSender.java的实现描述：QQ微博发送实现类
 * 
 * @author fenglibin 2011-10-18 上午08:51:03
 */
public class QQWeiboSender extends WeiboSender {

    @Override
    public SendResult send(UsersTimeMsgVO msgVO) {
        // try {
        // OAuth oauth = new OAuth("801002131", "19f86df9dcd1bacd2885f10c7dfc3bce", null);
        // oauth.setOauth_token("cc16479289a14e47910c2fb78b7ea21d");
        // oauth.setOauth_token_secret("f57882b18c9d7d5a23a6183ea1b1f0f4");
        // // String response=tAPI.addt(oauth, WeiBoConst.ResultType.ResultType_Json, "104502055372919");
        // Private_API private_API = new Private_API();
        //
        // String response = private_API.add(oauth, WeiBoConst.ResultType.ResultType_Json, "hello", "127.0.0.1","tom");
        // System.out.println("response:" + response);
        //
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        return null;
    }

    public static void main(String[] args) {
        QQWeiboSender qq = new QQWeiboSender();
        qq.send(null);
    }
}
