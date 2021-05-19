package com.company.CodeWars;

import java.util.Arrays;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
        String a = number%2 == 0?"Even":"Odd";
        return a;
    }

    public static String highAndLow(String numbers) {
        // Code here or
        String[] strArray = numbers.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(intArray);
       /* for (int i = 0; i < intArray.length; i++) {
            System.out.println(strArray[i]);
        }*/
        int max = intArray[strArray.length-1];
        int min = intArray[0];
        return max + " " + min;
    }
}