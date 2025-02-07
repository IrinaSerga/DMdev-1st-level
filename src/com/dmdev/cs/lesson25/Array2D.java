package com.dmdev.cs.lesson25;

public class Array2D {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3}, //0
                {4, 5, 6}, //1
                {7, 8, 9}  //2
        };
        for (int i = 0; i < values.length; i++) {
            //     System.out.println(values[i]);
            int[] array = values[i];
            for (int j = 0; j < array.length; j++) {
                System.out.println(values[i][j] + " ");

            }
            System.out.println(); // отступ пустой строкой

        }
        System.out.println();
        for (int[] array : values) {
            for (int value : array) {
                System.out.println(value + " ");
            }
            System.out.println();

        }
    }
}
