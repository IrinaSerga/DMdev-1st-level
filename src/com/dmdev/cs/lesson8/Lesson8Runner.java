package com.dmdev.cs.lesson8;

public class Lesson8Runner {


    public static void main(String[] args) {
        double doubleValue = 12.98; // define + init
        System.out.println(doubleValue);

        int intValue;  // define
        intValue = 28; //initialization
        System.out.println(intValue); //int

        //Reassignment
        intValue = 67;
        System.out.println(intValue);

        int intValue2 = 1988;
        intValue = intValue2;
        System.out.println(intValue);

        final byte byteValue = 39; // cannot reassignment if final
        System.out.println(byteValue);
      //  byteValue  = -89;

        char charValue = 'q';
        System.out.println(charValue);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        String stringValue = "Hello World";
        System.out.println(stringValue);


    }
}
