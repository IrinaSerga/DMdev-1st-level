package com.dmdev.cs.lesson20;

public class Lesson20Runner {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    private static void forExample() {

        for (int value = 10; value>0; value--) { // нет обязательности всех трех условий. Например, можно опустить value-- и цикл станет бесконечным
            System.out.println(value);// для бесконечного лучше использовать while
        }
    }

    }