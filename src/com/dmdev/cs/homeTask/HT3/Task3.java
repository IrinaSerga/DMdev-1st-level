package com.dmdev.cs.homeTask.HT3;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */

public class Task3 {

    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        printArray(return2DArray(array));
        printArray(return2DArraySecondVariant(array));

    }

    private static int countPositiveValuesArrayLength(int[] array) {
        int positiveCount = 0;
        for (int value : array) {
            if (value > 0) {
                positiveCount++;
            }
        }
        return positiveCount;
    }

    private static int countNegativeValuesArrayLength(int[] array) {
        int negativeCount = 0;
        for (int value : array) {
            if (value > 0) {
                negativeCount++;
            }
        }
        return negativeCount;
    }

    private static int countZeroValuesArrayLength(int[] array) {
        int zeroCount = 0;
        for (int value : array) {
            if (value > 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }


    private static int[][] return2DArray(int[] array) {
        int[] negativeArray = new int[countNegativeValuesArrayLength(array)];
        int[] positiveArray = new int[countPositiveValuesArrayLength(array)];
        int[] zeroArray = new int[countZeroValuesArrayLength(array)];
        int positiveIndex = 0, negativeIndex = 0, zeroIndex = 0;
        for (int value : array) {
            if (value > 0) {
                positiveArray[positiveIndex++] = value;

            } else if (value < 0) {
                negativeArray[negativeIndex++] = value;

            } else {
                zeroArray[zeroIndex++] = value;
            }
        } return new int[][]{negativeArray, positiveArray, zeroArray};

    }

    // отображение массива
    public static void printArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }

        }
        System.out.println();
    }


    /////// second variant
    private static int[] countValueTypes(int[] array) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for (int value : array) {
            if (value > 0) positiveCount++;
            else if (value < 0) negativeCount++;
            else zeroCount++;
        }  return new int[]{positiveCount, negativeCount, zeroCount};

    }
    private static int[][] return2DArraySecondVariant(int[] array) {
        int[] counts = countValueTypes(array);
        int[] positiveArray = new int[counts[0]];
        int[] negativeArray = new int[counts[1]];
        int[] zeroArray = new int[counts[2]];
        int positiveIndex = 0, negativeIndex = 0, zeroIndex = 0;
        for (int value : array) {
            if (value > 0) {
                positiveArray[positiveIndex++] = value;

            } else if (value < 0) {
                negativeArray[negativeIndex++] = value;

            } else {
                zeroArray[zeroIndex++] = value;
                if (zeroArray.length == 0) {
                    zeroArray[zeroIndex++] = 0;
                }
            }
        } return new int[][]{negativeArray, positiveArray, zeroArray};

    }
}
