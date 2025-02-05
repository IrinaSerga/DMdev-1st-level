package com.dmdev.cs.lesson21;

/**
 * Написать программу, которая проходит циклом по английскому алфавиту,
 * начиная с буквы "b" и выводит каждую букву до тех пор, пока не встретит гласную (т е вывести согласные на консоль )
 */

public class Task5 {
    public static void main(String[] args) {
        char startLetter = 'f'; // под капотом это число
        //System.out.println((int)startLetter);
        printLetters(startLetter);

    }

    private static void printLetters(char startLetter) {
        for (char currentLetter = startLetter; !isVowel(currentLetter); currentLetter++) {
            System.out.println(currentLetter);
        }
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o';
    }
}


/*
private static boolean isVowel(char letter) {
    return switch (letter) {
        case 'a', 'e', 'i', 'o', 'u' -> true;
        default -> false;
    };
}

 */