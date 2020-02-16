package cn.cwj.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式转换工具类
 */
public class DateUtils {
    /**
     * 日期转化为字符串
     * @param date
     * @param format
     * @return
     */
    public static String getDateStr(Date date,String format){
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 字符串转为日期
     * @param format
     * @param date
     * @return
     */
    public static Date getDate(String format,String date){
        try {
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
