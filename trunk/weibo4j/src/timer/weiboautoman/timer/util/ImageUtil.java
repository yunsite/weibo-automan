package weiboautoman.timer.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weibo4j.WeiboException;
import weibo4j.http.ImageItem;

public class ImageUtil {

    private static Logger log = LoggerFactory.getLogger(ImageUtil.class);

    public static ImageItem readImageItem(String imageSrc) throws WeiboException, IOException {
        String name = FileUtil.getFileName(imageSrc);
        byte[] content = readImageByteArray(imageSrc);
        return new ImageItem(name, content);
    }

    public static byte[] readImageByteArray(String imageSrc) throws IOException {
        byte[] bt = null;
        org.apache.commons.httpclient.HttpClient httpclient = HttpClientUtil.getHttpClient();
        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("User-Agent", "Mozilla/3.0 (compatible; MSIE 6.0; Windows NT 6.1)"));
        httpclient.getHostConfiguration().getParams().setParameter("http.default-headers", headers);
        GetMethod get = new GetMethod(imageSrc);
        InputStream instream = null;
        try {
            httpclient.executeMethod(get);
            int imageSize = Integer.parseInt(get.getResponseHeader("Content-Length").getValue());
            instream = get.getResponseBodyAsStream();
            bt = new byte[imageSize];
            int length = -1;
            byte[] readByte = new byte[2048];
            int destPos = 0;
            while ((length = instream.read(readByte)) != -1) {
                System.arraycopy(readByte, 0, bt, destPos, length);
                destPos += length;
            }
        } catch (HttpException e) {
            if (log.isErrorEnabled()) {
                log.error("get image from network error:" + e.getMessage(), e);
            }
        } catch (IOException e) {
            if (log.isErrorEnabled()) {
                log.error("get image from network error:" + e.getMessage(), e);
            }
        } finally {
            if (instream != null) {
                instream.close();
            }
        }
        return bt;
    }

    /**
     * 将图片保存到本地，并返回图片保存后的绝对路径
     * 
     * @param imagePath 图片保存的前缀路径
     * @param imageUrl 图片的网络地址
     * @return
     */
    public static String saveImage(String imagePath, String imageUrl) {
        String tempUrlImageDir = "tempUrlImageDir";
        String date = DateUtil.getNow("yyyy-MM-dd");
        /* 将图片URL中的中文编码进行还原 */
        try {
            imageUrl = URLDecoder.decode(imageUrl, "GBK");
        } catch (UnsupportedEncodingException e) {
        }
        /* 获取文件名，没有路径 */
        String imageName = FileUtil.getFileName(imageUrl);
        /* 是否常用图片文件格式检查 */
        if (!FileUtil.isImageUsualFile(imageName)) {
            return null;
        }
        // 将文件重新命名
        imageName = String.valueOf(System.currentTimeMillis()).concat(String.valueOf(NumberUtil.getRandomInt())) + "."
                    + FileUtil.getFileExtensation(imageName);
        String imageSaveLocation = imagePath + tempUrlImageDir + File.separator + date + File.separator;
        File descDir = new File(imageSaveLocation);
        if (!descDir.exists()) {
            descDir.mkdirs();
        }
        /* 将获取到的内容以文件的形式写到本地 */
        /* 获取远程文件到本地指定目录并保存，如果因为某张图片处理错误，那忽略该错误 */
        FileUtil.downloadFileByUrl(imageUrl, imageSaveLocation, imageName);
        return imageSaveLocation + imageName;
    }
}
