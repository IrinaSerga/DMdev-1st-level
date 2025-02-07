package com.dmdev.cs.lesson24;

public class Lesson24Runner {
    public static void main(String[] args) {
        //    int[][] values = new int[3][4]; //обязательно указівать только размер первого измерения
        //    System.out.println(values.length); //4
        //    System.out.println(values[1].length); //4
        //   System.out.println(values[2][3]); //0

        int[][] values = new int[3][];
        values[0] = new int[7]; // массив размера 7 под индексом 0 на первом измерении
        values[0][3] = 93;
        System.out.println(values[0][3]);
        System.out.println(values[0][1]);
        System.out.println(values.length);
        System.out.println(values[1]);
        System.out.println(values[0]);
        System.out.println(values[0].length);
    }

    private static void example1() {
        int[][] values = {
                {-1, 0},
                null, // без инициализации
                {8, 65, 34, -6},
                {} // пустой
        };
        System.out.println(values.length); //4
        System.out.println(values[0].length); //2
        System.out.println(values[0][1]); //0
        System.out.println(values[2][2]); //34
        System.out.println(values[1]); //null
    }


   // многомерные массивы. Тип данных хранит только на последнем измерении
}
