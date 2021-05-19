package com.company.MultithreadingQuest.String;

public class SmallStringTests {
    public static void main(String[] args) {
        String s1 = "VASYZ";
        char[] chars;
        chars = s1.toCharArray();

        for (char a : chars
             ) {
            int ig = (int)a + 1;
            char ch = (char) ig;
            System.out.println(ch);
        }

        System.out.println(String.format("%-8s%-30s%-8s%-4s", 198479,  "Шорты пляжные черные с рисунком", 173.00, 17));
    }

}
