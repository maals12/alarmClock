package com.company;

import java.io.*;
import java.util.*;

public class URL_handler {
    private static Object[] listURL;

    /**
     * Gets URLs from text file
     */
    public static void getURLfromFile() throws IOException{
        List<String> urls = new ArrayList<String>();
        String url;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Miguel\\Documents\\FALL2017\\alarmClock\\URL"));
            while((url = reader.readLine()) != null) {
                urls.add(url.replace("\n",""));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        listURL = urls.toArray();
    }

    /**
     * Gets specific index and returns that String
     * to program
     * @param index
     * @return
     */
    public static String getURL(int index){
        return (String) listURL[index];
    }

    /**
     * Used to randomly pick a URL
     * @return random index
     */
    private static int randomizeURL() {
        Random rand = new Random();
        int rand_num = rand.nextInt(listURL.length);
        return rand_num;
    }

    /**
     * Gets a random URL
     * @return string of url
     */
    public static String getRandURL(){
        return (String)listURL[randomizeURL()];
    }

    /**
     * Error Checking Function to see
     * what url I am looking at
     * @param rand_index
     */

    public static void printURL(int rand_index){
        System.out.print(listURL[rand_index]);
        System.out.print("\n");
        System.out.print("\n");
    }

    /**
     * Prints list of URLs read
     */

    public static void printURLs(){
        for(int i = 0; i < listURL.length; ++i){
            System.out.print(listURL[i]);
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
