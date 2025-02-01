package com.dmdev.cs.homeTask.HT1;


/**
 * Задание 2
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {

    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 0.0;
        char operation = '/';


        double result = getCalcResult(operand1, operand2, operation);
        String equation = formatter(operand1, operand2, operation);
        if (Double.isNaN(result)) { // это исправление предложила Idea. Исходно было result == Double.NaN
            System.out.println("Something went wrong");
        } else System.out.println("Result: " + result + equation);
    }


    //  / и % не работают с нулем
    // отрицательные тоже подходят
    public static double getCalcResult(double operand1, double operand2, char operation) {
        double result = Double.NaN; // Изначально результат не определен
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else System.out.println("Invalid value! operand2 can`t be equal " + operand2);
            }
            case '%' -> {
                if (operand2 != 0) {
                    result = operand1 % operand2;
                } else System.out.println("Invalid value! operand2 can`t be equal " + operand2);
            }

            default -> System.out.println("Unexpected value");
        }
        return result;
    }

    public static String formatter(double operand1, double operand2, char operation) {
        return " (" + operand1 + " " + operation + " " + operand2 + ")";
    }
}
