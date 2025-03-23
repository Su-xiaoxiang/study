package com.zs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils {
    private static final String DEFAULT_PATTERN = "yyyy-MM-dd";
    private static final SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
    
    /**
     * 字符串转日期
     */
    public static Date parseDate(String dateStr) {
        if (StringUtil.isEmpty(dateStr)) {
            return null;
        }
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }
    
    /**
     * 日期转字符串
     */
    public static String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        return sdf.format(date);
    }
    
    /**
     * 按指定格式格式化日期
     */
    public static String formatDate(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }
    
    /**
     * 获取当前日期
     */
    public static Date getCurrentDate() {
        return new Date();
    }
    
    /**
     * 获取当前日期字符串
     */
    public static String getCurrentDateStr() {
        return formatDate(getCurrentDate());
    }
} 