package weiboautoman.timer.util;

import java.io.IOException;
import java.io.InputStream;
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
}
