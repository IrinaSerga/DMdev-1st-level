package com.dmdev.cs.lesson9;

public class Lesson9Runner {

    public static void main(String[] args) {
        int value = 10;
        System.out.println(value / 4); // if you use two int values, as a result you have int; Cannot hold the decimal part
        System.out.println(value / (double) 4); // implicit type declaration


        double value1 = 10; //Explicit type declaration
        System.out.println(value1 / 4);
        System.out.println(value / 4.0);

/*
        int value = 10;
        value = value + 1;
        value += 1;
        value++; //unary operation, increment
        value--; //decrement
        System.out.println(value);


        int value = 10;
        value = value + 5; //first calc right part
        System.out.println(value);

        value = (value + 5) / 3;
        System.out.println(value);


        //math operation: *,-,/,%
        int first = 10;
        int second = 4;
        int value = first + second;
        System.out.println(value);*/
    }
}
