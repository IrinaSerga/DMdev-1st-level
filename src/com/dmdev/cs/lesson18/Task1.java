package com.dmdev.cs.lesson18;

public class Task1 {

    public static void main(String[] args) {
        int first = 90;
        int Second = 50;


        int result = getMax(first, Second);
        System.out.println("Max value is: " + result);

        int result2 = Math.max(first, Second);
        System.out.println("Min value is: " + result2);
    }


    public static int getMax(int value1, int value2) {
        return value1 > value2 ? value1 : value2;
        // if (value1>value2) {
        //     return value1;
        //   }
        //  return value2;
    }


}
