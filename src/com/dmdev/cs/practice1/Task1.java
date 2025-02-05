package com.dmdev.cs.practice1;


import java.util.Scanner;

/**
 * Задача 1
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // for input from keyboard
        System.out.println("Input day: ");
        int day = sc.nextInt(); // read input value
        System.out.println("Input month: ");
        int month = sc.nextInt(); //метод nextInt() автоматически интерпретирует числа без учета ведущих нулей. Например, ввод 02 будет интерпретироваться как 2.
        System.out.println("Input year: ");
        int year = sc.nextInt();

        // validate
        boolean result = isInputValuesValid(day, month, year);
        if (result) {
            getNextDayDate(day, month, year);
        } else
            System.out.println("Invalid input values: " + formatter(day, month, year));
        // не хватает вывода пользователю где именно он "промахнулся"(конкретно: день? месяц? год?)

    }
    // if d 1-28 and m = 2  and isLeapYear = false - go to next month
    // if d 1-30 and m = 4,6,9,11 - go to next month
    // if d > 30 and m == 8,10,12 + NY

    public static void getNextDayDate(int day, int month, int year) {
         var first = 1;
        // Проверка для февраля (високосный год или нет)
        if (month == 2) {
            if ((isLeapYear(year) && day == 29) || (!isLeapYear(year) && day == 28)) {
                System.out.println(formatter(first, getNextMonthNumber(month), year));
            } else {
                System.out.println(formatter(getNextDayNumber(day), month, year));
            }
        }
        // 30-дневные
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                System.out.println(formatter(first, getNextMonthNumber(month), year));
            } else {
                System.out.println(formatter(getNextDayNumber(day), month, year));
            }
        }
        // 31-дневные  + NY
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                if (month == 12) {
                    System.out.println(formatter(first, first, year + 1)); // NY
                } else {
                    System.out.println(formatter(first, getNextMonthNumber(month), year)); // след месяц
                }
            } else {
                System.out.println(formatter(getNextDayNumber(day), month, year)); // след день
            }
        }
    }

    public static String formatter(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    public static boolean isInputValuesValid(int day, int month, int year) {
        if (day <= 0 || month <= 0 || month > 12 || year < 0) {
            return false;
        }
        if ((month == 2 && isLeapYear(year) && day > 29) || (month == 2 && !isLeapYear(year) && day > 28)) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            return false;
        }
        return true;
    }


    public static int getNextMonthNumber(int month) {
        return month + 1;
    }

    public static int getNextDayNumber(int day) {
        return day + 1;
    }


    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

// questions:
// на вход -  три числа (это указано в задании), а вот формат вывода - описан неоднозначно в ТЗ :-)
// Могут быть варианты:
// "Понедельник.Октябрь.1986"
// "22.10.1986"
// "22.Октября.1986"