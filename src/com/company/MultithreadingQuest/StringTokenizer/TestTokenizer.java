package com.company.MultithreadingQuest.StringTokenizer;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TestTokenizer {
    public static void main(String[] args) {
        String a = "level22.lesson13.task01";
        StringTokenizer stringTokenizer = new StringTokenizer(a, ".");
        String[] b = new String[stringTokenizer.countTokens()];
        System.out.println(b);
        String c  = "level22.lesson13.task01";
        System.out.println(getTokens2(c, ".").length);
        System.out.println(Arrays.toString(getTokens2(c, ".")));
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

    public static String[] getTokens2(String query, String delimiter) {


        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        int a = stringTokenizer.countTokens();
        for (int i = 0; i < a; i++) {
            result[i] = stringTokenizer.nextToken();
        }


        return result;
    }
}
