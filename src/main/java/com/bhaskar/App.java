package com.bhaskar;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        String currentDate = getFormattedCurrentDate();
        String hostname = getHostname();

        System.out.println("Hello, World!");
        System.out.println("Today's Date is: " + currentDate);
        System.out.println("Hostname: " + hostname);
    }

    static String getFormattedCurrentDate() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(currentDate);
    }

    static String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "Unknown Host";
        }
    }
}

