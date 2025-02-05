package com.dmdev.cs.lesson21;


/**
 * Написать программу, определяющую, является ли введенное целое число простым,
 * т е делится без остатка только на 1 и на само себя
 */
public class Task4 {
    public static void main(String[] args) {

        // 1 < value < 21   простім является число, которое делится на 1 и на само себя без остатка
        int value = 21;
        boolean result = isSimple(value);
        System.out.println(result);

    }

    private static boolean isSimple(int value) { // несколько return в маленьких методах - это окей
        for (int currentValue = 2; currentValue < value; currentValue++) {
            if (value % currentValue == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
public class Task4 {
    public static void main(String[] args) {
        int value = 21;
        boolean result = isSimple(value);
        System.out.println(value + " — " + (result ? "простое" : "составное") + " число.");
    }

    private static boolean isSimple(int value) {
        if (value < 2) return false; // Числа меньше 2 не являются простыми

        for (int currentValue = 2; currentValue * currentValue <= value; currentValue++) {
            if (value % currentValue == 0) {
                return false; // Нашли делитель — число не простое
            }
        }
        return true; // Делителей не найдено — число простое
    }
}

 */


