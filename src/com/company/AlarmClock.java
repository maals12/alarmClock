package com.company;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class AlarmClock extends Clock{
    private int setHours,setMinutes, setSeconds, isAM;
    private com.company.Clock actualTime = new com.company.Clock();

    public AlarmClock(int hours, int minutes, int am_pm){
      setHours = hours;
      setMinutes = minutes;
      setSeconds = 0;
      isAM = am_pm;
    }
    public void tick(){
        actualTime.Seconds = actualTime.Seconds + 1;
        actualTime.Minutes = actualTime.Minutes + actualTime.Seconds / 60;
        actualTime.Hours = actualTime.Hours + actualTime.Minutes / 60;
        actualTime.Seconds = actualTime.Seconds % 60;
        actualTime.Minutes = actualTime.Minutes % 60;
        actualTime.Hours = actualTime.Hours % 12;
        if(actualTime.Hours == 0)
        {
            if(AM_PM == Calendar.AM)
            {
                AM_PM = Calendar.PM;
            }
            else{
                AM_PM = Calendar.AM;
            }
            actualTime.Hours = 12;
        }
        if (actualTime.Hours == setHours && actualTime.Minutes == setMinutes && actualTime.Seconds == setSeconds && isAM == AM_PM) {
            System.out.println("************GOOD MORNING!!************");
            URL_handler.runGoodMorning();
        }
    }
    public void Show()
    {
        actualTime.Show();
    }
}

