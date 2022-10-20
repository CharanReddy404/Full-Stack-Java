package com.company;

public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        int y = (int)((minutes/60)/24)/365;
        int d = (int)((minutes/60)/24)%365;
        System.out.println(minutes+" min = "+y+" y and "+d+" d");
    }
}
