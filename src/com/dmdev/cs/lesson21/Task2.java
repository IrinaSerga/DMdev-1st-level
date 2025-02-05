package com.dmdev.cs.lesson21;


/**
 * Имеется число. Посчитать сумму цифр данного числа
 * разбора числа по разрядам, уменьшая его на порядок в каждой итерации.
 */

public class Task2 {

    public static void main(String[] args) {
        int value = -12345; // 12345 % 10  = 5 -> 12345/10 =1234 -> 1234/10 = 123 -> 123/10 = 12-> 12/10 = 1
        int result = sum(value);
        System.out.println(result);
        System.out.println(sumWhile(value));

    }

    private static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) { //Оператор /= — это составной оператор присваивания в Java. a /= b; → a = a / b;
            // (value > 0 ? value : value * -1) тернарный оператор  для обработки отрицательных чисел
            //Оператор % в Java называется оператором остатка от деления (или модулем). Он возвращает остаток от деления одного числа на другое.
            result += currentValue % 10;
        }
        return result;
    }


    private static int sumWhile ( int value){
        int result = 0;
        int currentValue = (value > 0 ? value : value * -1);
        while (currentValue > 0) {
            result += currentValue % 10;
            currentValue /= 10;  // increment
        }


        return result;
    }



}
