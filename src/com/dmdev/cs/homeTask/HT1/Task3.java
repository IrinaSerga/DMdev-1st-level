package com.dmdev.cs.homeTask.HT1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Task3 {

    public static void main(String[] args) {

        int a1 = 0, b1 = -4;
        int a2 = 5, b2 = 12;

        double area1 = calcTriangleArea(a1, b1);
        double area2 = calcTriangleArea(a2, b2);

        compareTriangleAreas(area1, area2);

    }

    //Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
    //Основная формула: значение площади треугольника прямоугольного равно произведению длин его катетов, разделенному на 2 – S = a * в / 2. Где: а и в – катеты.
    // стороны должны быть больше нуля
    public static double calcTriangleArea(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid values for calcTriangleArea");
            return -1;
        }
        return (double) (a * b) / 2;
    }

    //Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
    // площадь не может бвть ноль ; и -1 говорит об ошибке
    public static void compareTriangleAreas(double area1, double area2) {
        if (area1 <= 0 || area2 <= 0) {
            System.out.println("Invalid values for compareTriangleAreas");
            return;
        }
        if (area1 > area2) {
            System.out.println("The area of the first triangle is greater than area of the second triangle");
        } else if (area1 < area2) {
            System.out.println("The area of the first triangle is less than area of the second triangle");
        } else System.out.println("The area of the first triangle is equal to area of the second triangle");
    }
}
