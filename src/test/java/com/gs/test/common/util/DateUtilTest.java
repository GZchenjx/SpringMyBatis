package com.gs.test.common.util;

import com.gs.common.util.DateUtil;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by WangGenshen on 7/20/15.
 */
public class DateUtilTest {

    @Test
    public void testPastTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(2015, 6, 18, 13, 18, 27);
        System.out.println(DateUtil.pastTime(cal));
    }

}
