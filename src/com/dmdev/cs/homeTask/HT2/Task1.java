package com.dmdev.cs.homeTask.HT2;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */


public class Task1 {

    public static void main(String[] args) {
        int value = 228910;

        System.out.println("Кол-во четных цифр: " + calcEvenNumbers(value));
        System.out.println("Кол-во нечетных цифр: " + calcOddNumbers(value));
    }

    // четные : если result / 2 = 0
    private static int calcEvenNumbers(int value) {
        int count = 0;
        while (value > 0) {
            int resultMod = value % 10;  // последняя цифра
            if (resultMod % 2 == 0) { // если остаток от деления на 2 цифры = 0, то она четная
                count++;
            }
            value /= 10; // value = value / 10 - отбрасываем последнюю цифру
        }
        return count;
    }

    // нечетные : если result / 2 = 1
    private static int calcOddNumbers(int value) {
        int count = 0;
        while (value > 0) {
            int resultMod = value % 10;  // последняя цифра
            if (resultMod % 2 == 1) { // если остаток от деления на 2 цифры = 1, то она нечетная
                count++;
            }
            value /= 10; // value = value / 10 - отбрасываем последнюю цифру
        }
        return count;
    }

//    условие можно вынести в отельный метод
//    private static boolean isEven(int value) {
//        return value % 2 == 0;
}

