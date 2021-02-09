package com.company.ThinkingJava;

public class Lesson_5_InitializationAndFinalize {
    public static void printArray(Object... args) {
        for (Object obj : args
             ) {
            System.out.println(obj + " привет ");
        }
    }
}
