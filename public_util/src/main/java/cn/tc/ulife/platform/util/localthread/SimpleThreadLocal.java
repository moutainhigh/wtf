/**
 *
 */

package cn.tc.ulife.platform.util.localthread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wy
 */
public final class SimpleThreadLocal {
    private static final Object objecLock = new Object();

    private static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>();

    public static final String dataPattern = "yyyy-MM-dd HH:mm:ss";
    public static final String dataPattern1 = "yyyy-MM-dd ";

    private static SimpleDateFormat getSdf(final String pattern) {
        ThreadLocal<SimpleDateFormat> tsdf = sdfMap.get(pattern);
        if (tsdf == null) {
            synchronized (objecLock) {
                tsdf = sdfMap.get(pattern);
                if (tsdf == null) {

                    tsdf = new ThreadLocal<SimpleDateFormat>() {

                        @Override
                        protected SimpleDateFormat initialValue() {

                            return new SimpleDateFormat(pattern);
                        }
                    };
                    sdfMap.put(pattern, tsdf);
                }
            }
        }
        ;
        return tsdf.get();
    }

    public static String format(Date date, String pattern) {
        return getSdf(pattern).format(date);
    }

    public static Date parse(String dateStr, String pattern)
            throws ParseException {
        return getSdf(pattern).parse(dateStr);
    }

    public static String subParse(String dateStr, String pattern) throws ParseException {
        return getSdf(pattern).format(getSdf(pattern).parse(dateStr));
    }
}
