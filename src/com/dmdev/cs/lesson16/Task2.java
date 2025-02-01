package com.dmdev.cs.lesson16;

/**
 * Дано целое число. Определить, является ли последняя цифра єтого числа - цифрой 3.
 */


/**
 * деление на 10 -  последняя цифра
 * деление на 100 - 2 последние
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 1233243;
        int reminder = value % 10;
        boolean test = reminder == 3 ||reminder ==-3;
        if (test) { // value % 10 == 3
            System.out.println("Yes");
        } else {
            System.out.println("No. Reminder:" + reminder);
        }

    }
}
