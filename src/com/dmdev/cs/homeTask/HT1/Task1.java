package com.dmdev.cs.homeTask.HT1;

/**
 * Задание 1
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */

public class Task1 {

    public static void main(String[] args) {
        int minutes = 59;

        if (0 <= minutes && minutes <= 59) { // эта проверка может жить и в getQuarter, но, вероятно, здесь более правильно, чтобы при инвалидных данных совсем не заходить в getQuarter
            getQuarter(minutes);
        } else {
            System.out.println("Wrong input minutes");
        }

    }

    public static void getQuarter(int minutes) {
        //1я четверть 0-14
        if (0 <= minutes && minutes <= 14) {
            System.out.println("Quarter first");
            //2я четверть 15-29
        } else if (15 <= minutes && minutes <= 29) {
            System.out.println("Quarter second");
            //3я четверть 30-44
        } else if (30 <= minutes && minutes <= 44) {
            System.out.println("Quarter third");
            //4я четверть 45-59
        } else if (45 <= minutes && minutes <= 59) {
            System.out.println("Quarter fourth");
        }
    }
}
