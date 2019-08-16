package com.itheima.ssm.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式转换工具类
 */
public class DateUtils {
    //日期转换为字符串
    public  static String Date2String(Date date, String patt) {
        DateFormat df = new SimpleDateFormat(patt);
        String format = df.format(date);
        return format;
    }

    //字符串转换为日期
    public static Date String2Date(String patt, String date) throws ParseException {
        DateFormat df = new SimpleDateFormat(patt);
        Date parse = df.parse(date);
        return parse;
    }

}
