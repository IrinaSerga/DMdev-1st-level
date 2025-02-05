package com.dmdev.cs.lesson21;

/**
 * В 1626 году индейцы продали Манжэттен за 24$.
 * Написать программу, которая высчитает сумму,
 * получившуюся бы в текущем году, если бы
 * индейцы положили эти деньги в банк под 5% годовых
 */

public class Task3 {
    public static void main(String[] args) {
        int startYear = 1626;
        int startCapital = 24;
        double percent = 0.05;
        double result = amount(startYear, startCapital, percent);
        System.out.println(result);

    }

    private static double amount(int startYear, int startCapital, double percent) {
        double result = startCapital;
        for (int currentYear = startYear + 1; currentYear <= 2025; currentYear++) {
            //24 += 24 * 0.05
            // double value = 24;
            // value = value + (value * 0.05);
            // System.out.println(value); // 25.2
            result += result * percent;
            System.out.println(currentYear + ": " + result);
        }


        return result;
    }


/*
Число 6.835048028544902E9 записано в научной (или экспоненциальной) форме.
Что это означает?
E9 в конце числа — это сокращённая запись для умножения на 10 в степени 9. То есть:
6,835,048,028.544902
Объяснение:
6.835048028544902 — это мантисса, основная часть числа.
E9 — это экспоненциальная форма, которая означает умножение на то есть на 1 миллиард.
Таким образом, 6.835048028544902E9 — это число 6,835,048,028.544902 (примерно 6.83 миллиарда).
*/
}
