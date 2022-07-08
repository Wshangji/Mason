package com.gradwyn.mason.util;

import java.util.Date;

public class DateUtil {

    /**
     * 通过时间秒毫秒数判断提交时间间隔
     * @param date1
     * @return
     */
    public static int differentDaysByMillisecond(Date date1) {
        Date date2 = new Date();
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;
    }

}
