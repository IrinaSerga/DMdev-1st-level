package com.dmdev.cs.lesson23;

public class Lesson23Runner {

    public static void main(String[] args) {
        int[] value = new int[3]; // по дефолту наполняется нулями (byte, short, int, long)
        double[] value2 = new double[3];// {0.0, 0.0, 0.0};
        boolean[] value3 = new boolean[3];// {false, false, false}
        char[] value4 = new char[3]; //{ ,  , }
        System.out.println(value[1]);
        System.out.println(value2[1]);
        System.out.println(value3[1]);
        System.out.println(value4[1]);


    }

    private static void example1() {
        int[] value = {1, 6, 9, -34, 109};
        System.out.println(value.length);
        System.out.println(value[4]);
        value[4] = 784;
        System.out.println(value[4]);
    }
}
