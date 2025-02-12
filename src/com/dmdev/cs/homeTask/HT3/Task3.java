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

    }


    // отображение массива
    public static void printArray(int[][] values) {
        System.out.print("["); // начало массива
        for (int[] value : values) { //for (int i = 0; i < values.length; i++)
            System.out.print("["); // начало массива
            for (int j = 0; j < value.length; j++) {
                System.out.print(value[j]);
                if (j < value.length - 1) { // Добавляем запятую между элементами
                    System.out.print(", ");
                }
            }
            System.out.print("]"); // конец
        }
        System.out.println("]"); // конец
    }

    //считаем
    private static int[] countValueTypes(int[] array) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for (int value : array) {
            if (value > 0) positiveCount++;
            else if (value < 0) negativeCount++;
            else zeroCount++;
        }
        return new int[]{positiveCount, negativeCount, zeroCount};

    }

    private static int[][] return2DArray(int[] array) {
        int[] counts = countValueTypes(array);
        int[] positiveArray = counts[0] > 0 ? new int[counts[0]] : new int[0];
        int[] negativeArray = counts[1] > 0 ? new int[counts[1]] : new int[0];
        int[] zeroArray = counts[2] > 0 ? new int[counts[2]] : new int[0];
        int positiveIndex = 0, negativeIndex = 0, zeroIndex = 0;
        for (int value : array) {
            if (value > 0) {
                positiveArray[positiveIndex++] = value;

            } else if (value < 0) {
                negativeArray[negativeIndex++] = value;

            } else {
                zeroArray[zeroIndex++] = value;
            }
        }
        return new int[][]{negativeArray, positiveArray, zeroArray};

    }

//    вот один из способов реализации
//    public class Task3Arrays {
//        private static final int NEGATIVE_ARRAY_INDEX = 0;
//        private static final int POSITIVE_ARRAY_INDEX = 1;
//        private static final int ZERO_ARRAY_INDEX = 2;
//
//        public static void main(String[] args) {
//            int[] values = {-4, 0, 1, 9, 0, -18, 3};
//            System.out.println("Изначальный массив: " + Arrays.toString(values));
//            int[][] result = getNumbers(values);
//            printTwoDimensionalArray(result);
//
//        }
//
//        private static int[][] getNumbers(final int[] values) {
//            int[][] result = new int[3][];
//            int negativeCount = 0;
//            int positiveCount = 0;
//            int zerosCount = 0;
//
//            for (int value : values) {
//                if (value  0) {
//                    negativeCount++;
//                } else if (value > 0) {
//                    positiveCount++;
//                } else {
//                    zerosCount++;
//                }
//            }
//            result[NEGATIVE_ARRAY_INDEX] = new int[negativeCount];
//            result[POSITIVE_ARRAY_INDEX] = new int[positiveCount];
//            result[ZERO_ARRAY_INDEX] = new int[zerosCount];
//
//            return TwoDimensionalArray(result, values);
//        }
//
//        private static int[][] TwoDimensionalArray(int[][] array, int[] values) {
//
//            int negativeIndex = 0;
//            int positiveIndex = 0;
//            int zerosIndex = 0;
//
//            for (int value : values) {
//                if (value  0) {
//                    array[NEGATIVE_ARRAY_INDEX][negativeIndex] = value;
//                    negativeIndex++;
//                } else if (value > 0) {
//                    array[POSITIVE_ARRAY_INDEX][positiveIndex] = value;
//                    positiveIndex++;
//                } else {
//                    array[ZERO_ARRAY_INDEX][zerosIndex] = value;
//                    zerosIndex++;
//                }
//            }
//            return array;
//        }
//
//        private static void printTwoDimensionalArray(int[][] result) {
//            for (int[] ints : result) {
//                System.out.println(Arrays.toString(ints));
//            }
//        }
//    }
}
