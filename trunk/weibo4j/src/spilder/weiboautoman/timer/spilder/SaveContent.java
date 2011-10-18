package weiboautoman.timer.spilder;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.httpclient.HttpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import weiboautoman.timer.core.Constants;
import weiboautoman.timer.dao.MsgDAO;
import weiboautoman.timer.dataobject.Msg;
import weiboautoman.timer.util.CodeUtil;
import weiboautoman.timer.util.FileUtil;
import weiboautoman.timer.util.HttpClientUtil;

import com.alibaba.fastjson.JSONObject;

/**
 * 类SaveContent.java的实现描述：获取皮皮时光机的内容并保存
 * 
 * @author fenglibin 2011-10-3 ����04:54:24
 */
public class SaveContent {

    private static final ConfigurableApplicationContext ctx    = new FileSystemXmlApplicationContext(
                                                                                                     new String[] { Constants.SPRING_CONFIG_FILE });
    private static MsgDAO                               msgDAO = (MsgDAO) ctx.getBean("msgDAO");
    private static Logger                               log4j  = LoggerFactory.getLogger(SaveContent.class);

    /**
     * @param args
     * @throws IOException
     * @throws HttpException
     */
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                ctx.close();
            }
        });
        String content = "";
        try {
            String cookie = FileUtil.getFileContent(args[0].trim());
            // String cookie =
            // "pp_weibo_content_time=; j2rZ_2132_auth=5039fm9R1L74jkjQDKj5IV1Nyq%2FZLat6pKqdE8wEDdQ8ai5yfT1YOJpzi5zOmx6fmLKdICm4RczjpbKfk1bdg2GBDdJd4Y49kX1%2FONvnmNW4x1fqX7M9Ckw; __utma=56876395.1779520664.1317621310.1318044968.1318052709.4; __utmb=56876395.1.10.1318052709; __utmc=56876395; __utmz=56876395.1317621310.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none)";
            cookie = cookie.trim();
            log4j.warn("cookie:" + cookie);
            String encode = "utf-8";
            for (int type_id = 1; type_id <= 22; type_id++) {
                if (type_id == 18) {
                    continue;
                }
                String url = "http://weibo.pp.cc/time/index.php?mod=content&action=show&account=2363930463&random=279&cid=0&page=1&tid="
                             + type_id;
                log4j.warn(url);
                content = HttpClientUtil.getGetResponseWithHttpClient(url, encode, cookie);
                PPTimeContentObject contentObject = JSONObject.parseObject(content, PPTimeContentObject.class);
                int totalPages = contentObject.getPages().getLastpage();
                for (int i = 1; i <= totalPages; i++) {
                    log4j.warn(url);
                    url = "http://weibo.pp.cc/time/index.php?mod=content&action=show&account=2363930463&random=279&cid=0&tid="
                          + type_id + "&page=" + i;
                    content = HttpClientUtil.getGetResponseWithHttpClient(url, encode, cookie);
                    contentObject = JSONObject.parseObject(content, PPTimeContentObject.class);
                    for (Rowset row : contentObject.getRowset()) {
                        saveContent(type_id, row);
                    }
                }
            }
        } catch (Exception e) {
            if (log4j.isErrorEnabled()) {
                log4j.error("error happened,content:" + content, e);
            }
        }

    }

    public static void saveContent(int type_id, Rowset row) {
        try {
            log4j.warn("saving one message.." + new Date());
            Msg msgDO = new Msg();
            msgDO.setContent(CodeUtil.ascii2Native(row.getContent()));
            msgDO.setId(Long.parseLong(row.getCid()));
            msgDO.setPicture(row.getPicture().getPath());
            msgDO.setSortno(1);
            msgDO.setTypeId(type_id);
            Msg msg = msgDAO.selectByPrimaryKey(Long.parseLong(row.getCid()));
            if (msg == null) {
                msgDAO.insert(msgDO);
            }
            saveImage(row.getPicture().getPath());
            log4j.warn("finish saved one message.." + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveImage(String imageSrc) {
        String imgUrl = "http://img2.pp.cc/attachment/weibo/";
        String fileName = FileUtil.getFileName(imageSrc);
        String imageSavePath = imageSrc.replace(fileName, "");
        File file = new File(imageSavePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File savedImage = new File(imageSrc);
        if (!savedImage.exists()) {
            log4j.warn("save image:" + (imgUrl + imageSrc));
            FileUtil.downloadFileByUrl(imgUrl + imageSrc, imageSrc);
            /** 下载缩略图 */
            imageSrc += ".thumb.jpg";
            log4j.warn("save image:" + (imgUrl + imageSrc));
            FileUtil.downloadFileByUrl(imgUrl + imageSrc, imageSrc);
        }
    }
}
