package weiboautoman.timer.util;

public class NumberUtil {

    public static long getPages(long totalCount, int pageSize) {
        return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }
}
