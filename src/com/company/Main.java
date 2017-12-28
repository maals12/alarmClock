package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.time.Clock;
import java.util.*;


public class Main {
    private static int AM = Calendar.AM;
    private static int PM = Calendar.PM;
    public static void main(String[] arg) {
	    // write your code here
        System.out.print("What time would you like to set you Alarm for? (Hour Minute AM/PM[0/1])");
        Scanner S = new Scanner(System.in);
        int hour, minute, am_pm;
        hour = S.nextInt();
        minute = S.nextInt();
        am_pm = S.nextInt();
        System.out.println();
        System.out.println("Enjoy!");
        AlarmClock A = new AlarmClock(hour, minute, am_pm);
        while(true) {
            A.tick();
            A.Show();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
