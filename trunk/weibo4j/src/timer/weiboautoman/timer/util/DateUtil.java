package weiboautoman.timer.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     * 根据传入的日期格式或者是默认的日期格式，返回当前的系统日期，格式可以为： String format = "yyyy-MM-dd HH:mm:ss,SSS";等
     * 
     * @param format
     * @return 根据传入的格式返回日期
     */
    public static String getNow(String format) {
        if (null == format || "".equals(format)) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String date = sdf.format(new Date());
        return date;
    }

    public static String timeStamp2Date(long timestamp) {
        timestamp = timestamp * 1000;
        String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(timestamp));
        return date;
    }

    public static void main(String[] args) {
        System.out.println(timeStamp2Date(1321236000));
    }
}
