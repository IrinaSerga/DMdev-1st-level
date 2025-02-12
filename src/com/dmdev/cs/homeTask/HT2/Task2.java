package com.dmdev.cs.homeTask.HT2;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Task2 {

    public static void main(String[] args) {
        int value = 4508;

        System.out.println("Обратное число: " + reverseValue(value));
    }


    // если брать мод от числа, то получу последнюю цифру
    // нужно посчитать сколько символов в числе
    private static int calcNumbersInValue(int value) {
        int count = 0;
        while (value > 0) {
            count++;
            value /= 10; // value = value / 10 - отбрасываем последнюю цифру
        }
        return count;
    }

    // по мод последняя цифра
    // есть кол-во цифр всего в числе
    // нужно цифру умножить  на 1000 или 100 или 10  ->  Math.pow и сложить
    // например: колво цифр =4, последняя цифра 8, 8 * 1000 =8000, 450: цифр уже 3 и снйчас 0: 0*100=0 , 45: цифр 2, умножаем на 10: 5*10=50,  4 : 1*4=4 Итого: 8000+0+50+4 =8054
    private static int reverseValue(int value) {
        int resultMod = 0;
        while (value > 0) {
            // последняя цифра
            int lastNumber = (value % 10);
            resultMod += lastNumber * (int) Math.pow(10, calcNumbersInValue(value) - 1); // первый разряд - уже десяток, потому минусуем от каунта 1
            value /= 10; // value = value / 10 - отбрасываем последнюю цифру
        }
        return resultMod;
    }

}
