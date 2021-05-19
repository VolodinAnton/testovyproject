package com.company.MultithreadingQuest.String;

import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        String asa = "String for split";
        String[] hg = asa.split(" ");
        for (String a : hg
             ) {
            System.out.println(a);
        }


      /*  String a = "Строка, созданная в куче";
        String b = "Строка, созданная в куче";
        String с = new String("Строка, созданная в рантайм, в стэке вызовов");

        String d = "Test";
        String e = "Test";
        String f = new String("Test");

        System.out.println(d == e); // равны, тк ссылки на Объекты-строки ссылаются на один объект в Пуле строк (он в куче). Это возможно, тк строки неизменяемые
        System.out.println(d == f);   // не равны, тк сравниваются ссылки, а у этих объектов ссылки разные и лежат в разных местах в памяти

        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"



        Date date = new Date();
        System.out.println(String.format(getFormattedStringDate(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59

        System.out.println(String.format(getFormattedStringExp(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00

        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
        String c = "JavaRush - лучший сервис обучения Java.";
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));*/

        String[] a = StringTest.getTokens("level22.lesson13.task01", ".");
        System.out.println(Arrays.toString(a));
       /* for (String b : a
             ) {
            System.out.println(b);
        }*/

    }

    public static String getFormattedString() {
        return "%3$s".toUpperCase(Locale.ROOT) + " " + "%4$s" + " " + "%2$s" + " " + "%1$s";
    }

    public static String getFormattedStringDate() {
        return "%td:%tm:%ty %tH:%tM:%tS";
    }

    public static String getFormattedStringExp() {
        //return "%d" + " = " + "%f" + "\n" + "Exp = " + "e";
       // return "20 / 7 = % %Exp = %";
        return "20 / 7 = %.2f\nExp = %.2e";
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();
        String[] a = string.split(" ");
        String result = "";
        for (int i = 1; i < 5; i++) {
            result = result + a[i] + " ";
        }
        result = result.trim();
        return result;
    }

    public static class TooShortStringException extends RuntimeException {
    }

    public static String[] getTokens(String query, String delimiter) {

        String r = "";
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        while (stringTokenizer.hasMoreTokens()) {
            r = r + stringTokenizer.nextToken() + " ";
        }
        r = r.trim();
        String[] result = r.split(" ");
        return result;
    }
}
