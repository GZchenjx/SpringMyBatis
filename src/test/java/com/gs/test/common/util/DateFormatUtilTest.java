package com.gs.test.common.util;

import com.gs.common.util.DateFormatUtil;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by WangGenshen on 7/20/15.
 */
public class DateFormatUtilTest {

    @Test
    public void testDateFomrat() {
        System.out.println(DateFormatUtil.defaultFormat(Calendar.getInstance()));
    }

}
