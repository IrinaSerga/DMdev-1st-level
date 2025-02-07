package com.dmdev.cs.lesson26;

/**
 * Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном
 */

public class Task1 {
    public static void main(String[] args) {
        int[] values = {5, 8, 92, 193, -67, 0};
        printArray(values);
        print2Array(values);
        printArrayReverse(values);

    }

    public static void printArrayReverse(int[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

        }
        System.out.println();
    }


    public static void print2Array(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");

        }
        System.out.println();
    }
}
