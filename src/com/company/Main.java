package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.util.*;


public class Main {

    public static void main(String[] arg) {
	    // write your code here
        String url;
        alarmClock.setTime();

        try {
            // Initializer
            URL_handler.getURLfromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Error check
        //URL_handler.printURLs();
        url = URL_handler.getRandURL();
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
}
