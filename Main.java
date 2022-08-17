package com.buchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));

    }
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) && (seconds < 0 && seconds > 59)) {
            return "Invalid vale";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}