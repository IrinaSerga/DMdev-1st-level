package com.dmdev.cs.homeTask.HT3;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */

public class Task2 {
    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+' };
        System.out.println("New array: ");
        Task1.printArray(getNewArrayAfterCompare(array));
    }


    //Преобразовать его в одномерный массив чисел
    private static int[] convertCharToNumber(char[] array) {
        int[] numbers = new int[array.length]; // длина та же что и у исходного
        for (int i = 0; i < array.length; i++) {
            numbers[i] = (int) array[i]; // приведение
        }
        return numbers;
    }

    //Далее определить среднее арифметическое всех элементов целочисленного массива
    private static double calcAverage(char[] array) {
        int[] startArray = convertCharToNumber(array);
        int sum = 0;
        int startArLength = startArray.length;
        for (int i = 0; i < startArLength; i++) {
            sum += startArray[i];
        }
        return (double) sum / startArLength; // приведение
    }

    private static int calcNewArrayLength(char[] array) {
        int length = 0;
        int averageValue = (int) calcAverage(array);
        for (int value = 0; value < array.length; value++) {
            if (array[value] > averageValue) {
                length++;
            }
        }
        return length;
    }

    private static int[] getNewArrayAfterCompare(char[] array) {
        int[] startArray = convertCharToNumber(array); // Инициализация массива положительных чисел
        int arrayLength = calcNewArrayLength(array); //4
        int[] result = new int[arrayLength];
        int index = 0;
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] > calcAverage(array)) {
                result[index++] = startArray[i];
            }

        }
        return result;
    }

}




