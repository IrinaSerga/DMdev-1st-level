package com.dmdev.cs.lesson17;

public class Lesson17Runner {


    //[modifiers] return_value nameVerb([param])
    public static void main(String[] args) {
        var year = 1900;
        boolean result = isLeapYear(year);
        System.out.println("Високосный: " + result);
        System.out.println("Високосный: " + isLeapYear(year));

    }

    public static boolean isLeapYear(int year) {
       return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        /*)
            return true;
        } else {
            return false;
        }*/
    }
}
