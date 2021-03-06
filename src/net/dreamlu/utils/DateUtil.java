package net.dreamlu.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.FastDateFormat;


/**
 * 格式化 Timestamp
 * @author L.cm
 * @date 2013-5-15 下午1:52:03
 */
public class DateUtil {
    
    public static final FastDateFormat DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd");
    public static final FastDateFormat DATE_FORMAT_CN = FastDateFormat.getInstance("yyyy年 MM月 dd日");
    public static final FastDateFormat DATE_FORMAT_RSS = FastDateFormat.getInstance("E, d MMM yyyy HH:mm:ss z", Locale.CHINA);
    
    /**
     * 格式化成yyyy-MM-dd
     * @param @param tamp
     * @param @return    设定文件
     * @return String    返回类型
     * @throws
     */
    public static String format(Timestamp tamp) {
        return DATE_FORMAT.format(tamp);
    }
    
    /**
     * 格式化成中文日期
     * @param @param tamp
     * @param @return    设定文件
     * @return String    返回类型
     * @throws
     */
    public static String formatCn(Timestamp tamp) {
        return DATE_FORMAT_CN.format(tamp);
    }
    
    /**
     * 格式化成RSS需要格式
     * @param @param tamp
     * @param @return    设定文件
     * @return String    返回类型
     * @throws
     */
    public static String formartRss(Timestamp tamp) {
        return DATE_FORMAT_RSS.format(tamp);
    }
    
    /**
     * hour小时之前
     */
    public static Date hourBefor(int hour){
    	return DateUtils.addHours(new Date(), -hour);
    }
    
    /**
     * today for example : 2014-10-28
     */
    public static String getToday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		return date;
	}
}
