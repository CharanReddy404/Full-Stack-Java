package com.company;

public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        long mph =(long) Math.round(kilometersPerHour/1.609);
        return mph;
    }

    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);
        if(mph==-1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+mph+" mi/h");
        }
    }
}