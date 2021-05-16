package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; // a constant



    public static void main(String[] args) {
	// write your code here

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }


    private static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 && seconds > 59 )){
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

       // return hours + "h " + remainingMinutes + "m " + seconds + "s";

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "h";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + "";

    }

    private static String getDurationString (int seconds){
        if ( seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);



    }

}