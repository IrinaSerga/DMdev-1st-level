package com.dmdev.cs.lesson15;

public class Lesson15Runner {

    public static void main(String[] args) {
        //byte  short int char String enum
        var month = 11; //var use if type of the right part understandable
        var result = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            default -> "Month is invalid";
        };
        System.out.println(result);
    }
}


//questions: что делать если в кейсе необходимо выполнить 2 действия? обертка в отдельный блок фигурных скобок?