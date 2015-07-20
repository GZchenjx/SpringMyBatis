package com.gs.common.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by WangGenshen on 7/20/15.
 */
public class DateFormatUtil extends DateFormatUtils {

    public static final String DEFAULT_PATTERN = "yyyy年MM月dd日 HH:mm:ss";

    public static String defaultFormat(Date date) {
        return DateFormatUtils.format(date, DEFAULT_PATTERN);
    }

    public static String defaultFormat(Calendar cal) {
        return DateFormatUtils.format(cal, DEFAULT_PATTERN);
    }

    public static String defaultFormat(long millis) {
        return DateFormatUtils.format(millis, DEFAULT_PATTERN);
    }

}
