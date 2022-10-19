package com.company;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int d1 = (int)(a*1000);
        int d2 = (int)(b*1000);
        if(d1==d2){
            return true;
        }
        return false;
    }
}
