package com.dmdev.cs.lesson19;

public class Lesson19Runner {

    public static void main(String[] args) {

        int value = 0;
        whileExample(0);
        doWhileExample(0);  // используется очень редко


    }


    public static void whileExample(int value) {
        while (value > 0) {  // в условии булеан
            System.out.println(value);
            value--; // (value = value -1; value-=1 ) декремент, без него цикл "вечный"
        }
    }


    public static void doWhileExample(int value) {
        do {
            System.out.println(value);
            value--; // (value = value -1; value-=1 ) декремент, без него цикл "вечный"

        } while (value > 0); //  в  такой интерпретации хотя бы раз выполнится блок кода while
    }
}
