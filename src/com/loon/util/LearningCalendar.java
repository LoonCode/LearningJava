package com.loon.util;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-30
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */
public class LearningCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("ERA is " + calendar.get(Calendar.ERA));

        System.out.println("YEAR is " + calendar.get(Calendar.YEAR));

        System.out.println("MONTH is " + calendar.get(Calendar.MONTH));

        System.out.println("DATE is  " + calendar.get(Calendar.DATE));

        System.out.println("DAY_OF_YEAR is " + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("AM_PM is " + calendar.get(Calendar.AM_PM));

        System.out.println("HOUR(12) is " + calendar.get(Calendar.HOUR));

        System.out.println("HOUR(24) is " + calendar.get(Calendar.HOUR_OF_DAY));

        System.out.println("MILLISECOND is " + calendar.get(Calendar.MILLISECOND));

        // the current date add 5 hour
        calendar.add(Calendar.HOUR,5);
        // the current date add 5 day
        calendar.add(Calendar.DATE,5);
        // the current date add 5 month
        calendar.add(Calendar.MONTH,5);
        // the current date add 5 year
        calendar.add(Calendar.YEAR,5);

        System.out.println(String.valueOf(calendar.getTime()));
        calendar.after(1);
        System.out.println(String.valueOf(calendar.getTime()));


    }
}
