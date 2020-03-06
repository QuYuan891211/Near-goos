package com.nmefc.neargoos.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author: QuYuan
 * @Description: 用于时间格式转换工具类
 * @Date: Created in 12:34 2019/2/22
 * @Modified By:
 */
public class DateTimeUtils {
/**
 * @description:  Mysql中的datetime类型对于与Java中的Timestamp类型，其它类型传入mysql时会报错
 *
 *
    date：只有日期，没有时间，2016-09-21；

    time：只有时间，没有日期，23:42:31；

    datetime：日期时间都有，2016-09-21 23:42:31 。

    timestamp：可以在进行Insert或者update的时候自动的为你插入时间，时间格式：2016-09-21 23:42:31。
 * @author: QuYuan
 * @date: 12:47 2019/2/22
 * @param: [date]
 * @return: java.sql.Timestamp
 */
    public static Timestamp date2timestamp(Date date){
        return new Timestamp(date.getTime());
    }

    /**
     *@Description:时间转换（UTC和GMT）
     *@Param: []
     *@Return: void
     *@Author: QuYuan
     *@Date: 2020/3/2 0:30
     */
    public static Date DateConvert(Date date) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);//设置起时间
        cal.add(Calendar.HOUR,8);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
//        String dateStr = format.format(date);
//        format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//        dateStr = format.format(date);
//        System.out.println(dateStr);
        Date newDate = cal.getTime();
        return newDate;
    }

}
