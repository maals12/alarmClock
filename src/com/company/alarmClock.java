package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class alarmClock {
    private static Calendar actualCal;
    public static Calendar userCal;
    private static DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm aa");

    public static void setTime(){
        actualCal = Calendar.getInstance();
        System.out.println(df.format(actualCal.getTime()));
        String dateFormat

    }

    
}
