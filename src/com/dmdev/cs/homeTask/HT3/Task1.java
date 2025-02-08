package com.dmdev.cs.homeTask.HT3;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Task1 {

    public static void main(String[] args) {
        // исходный одномерный массив
        int[] startArray = {3, 5, -6, 3, 2, -9, 0, -123};

        System.out.println("Lenght: " + calcNewArrayLength(startArray));
        System.out.println("Array with positive values: ");
        printArray(getFilteredArray(startArray));
        System.out.println("New array after multiply: ");
        printArray(getNewArrayAfterMultiply(startArray));
    }


    // Написать функцию, удаляющую из него все отрицательные элементы
    // (удалить - значит создать новый массив с только положительными элементами).
    private static int[] getFilteredArray(int[] array) {
        int[] result = new int[calcNewArrayLength(array)]; // инициализация нового массива
        int index = 0;
        for (int value : array) {
            if (value > 0) {
                result[index++] = value; // приоритет операции
            }
        }
        return result;

    }

    // подсчет длины нового массива положительных чисел. Без него не можем инициализировать новый массив
    private static int calcNewArrayLength(int[] array) {
        int length = 0;
        for (int value = 0; value < array.length; value++) {
            if (array[value] > 0) {
                length++;
            }
        }
        return length;
    }

    // умножить каждый элемент массива на его длину
    private static int[] getNewArrayAfterMultiply(int[] array) {
        int[] startArray = getFilteredArray(array); // Инициализация массива положительных чисел
        int arrayLength = startArray.length; //4
        int[] result = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            result[i] = startArray[i] * arrayLength;

        }
        return result;
    }

    // отображение массива
    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

        }
        System.out.println();
    }


}

