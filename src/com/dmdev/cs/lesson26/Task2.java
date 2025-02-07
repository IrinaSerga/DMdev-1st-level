package com.dmdev.cs.lesson26;

/**
 * Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающих его
 */

public class Task2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        Task1.printArray(values);

        fillArray(values);
        Task1.printArray(values);

        fillArrayWhile(values);
        Task1.printArray(values);
    }

    private static void fillArray(int[] values) {
       // int currentIndex = 0;
        for (int currentValue = 1, currentIndex = 0; currentIndex < values.length; currentValue++) { //в снкции иниализации и изменения знач-я может содержать несколько элементов
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex++] = currentValue; // приоритет операции
            }
        }
    }

    private static void fillArrayWhile(int[] values) {
        int currentIndex = 0;
        int currentValue = 1;

        while (currentIndex < values.length) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
            currentValue++;
        }
    }




}
