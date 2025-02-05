package com.dmdev.cs.lesson22;

/**
 * Еаписать программу, высчитывающую факториал целого числа
 * <p>
 * Факториал целого числа — это произведение всех натуральных чисел от 1 до этого числа включительно. Обозначается как n!.
 */

public class Lesson22Example {

    public static void main(String[] args) {
        int value = 5; //120 =1*2*3*4*5 =5!
        int result = factorial(value);
        System.out.println(result);

    }

    private static int factorial(int value) {
        if (value == 1) {
            return 1; // разворачивать как будто бы с конца
        }
        // 5 * (4 * (3 * (2 * (1)))  в конце идем в обратный ход рекурсии
        return value * factorial(value - 1);
    }
}
