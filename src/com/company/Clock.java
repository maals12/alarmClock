package com.company;

import java.util.Calendar;

public class Clock {
    protected int Hours,Minutes,Seconds, AM_PM;
    private static Calendar actualCal;


    public Clock(){
        actualCal = Calendar.getInstance();
        Hours = actualCal.get(Calendar.HOUR);
        Minutes = actualCal.get(Calendar.MINUTE);
        Seconds = actualCal.get(Calendar.SECOND);
        AM_PM = actualCal.get(Calendar.AM_PM);
    }
    public void tick(){
        Seconds = Seconds + 1;
        Minutes = Minutes + Seconds / 60;
        Hours = Hours + Minutes / 60;
        Seconds = Seconds % 60;
        Minutes = Minutes % 60;
        Hours = Hours % 12;
        if(Hours == 0)
        {
            if(AM_PM == Calendar.AM)
            {
                AM_PM = Calendar.PM;
            }
            else{
                AM_PM = Calendar.AM;
            }
            Hours = 12;
        }
    }

    public void Show(){
        System.out.print(String.format("%02d" + ":" + "%02d" + ":" + "%02d", Hours, Minutes, Seconds));
        if(AM_PM == Calendar.AM)
        {
            System.out.print("AM");
        }
        else{
            System.out.print("PM");
        }
        System.out.println();
    }
}
