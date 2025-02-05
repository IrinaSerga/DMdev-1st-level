package com.dmdev.cs.lesson21;

/**
 * Написать программу высчитывающую факториал введенного целого числа
 * <p>
 * Факториал целого числа — это произведение всех натуральных чисел от 1 до этого числа включительно.
 * <p>
 * Обозначается: n!
 * Формула:
 * n!=n×(n−1)×(n−2)×⋯×2×1
 * Примеры: 5!=5×4×3×2×1=120
 */


public class Task1 {

    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        int value = 4;
        int result = factorial(5);
        System.out.println(result);
        System.out.println(factorial(value));

    }

    public static int factorial(int value) {
        int result = 1;
        for (int currentValue = 1; currentValue <= value; currentValue++) {
            result *= currentValue;
        }
        return result;
    }


    public static int factorialWhile(int value) {
        int result = 1;
        int currentValue = 1;
        while (currentValue <= value) {
            result *= currentValue;
            currentValue++;
        }

        return result;
    }

}
