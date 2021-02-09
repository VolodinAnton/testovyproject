package com.company.ForSmallTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CodeWars {
    public static void main(String[] args) throws IOException, ParseException {
      /* String a = "1 8 545 2 3 10 200";
        System.out.println(CodeWars.highAndLow(a));*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateStr = reader.readLine();
        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd", Locale.ENGLISH);
        Date date = new Date();
        date = df.parse(dateStr);
        System.out.println(df.format(date));
        //Calendar calendar = new GregorianCalendar(df.getCalendar());

    }

    public static String highAndLow(String numbers) {
        // Code here or
        String[] strArray = numbers.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(strArray[i]);
        }
        int max = intArray[strArray.length-1];
        int min = intArray[0];
        return max + " " + min;
    }

    static long summy(String stringOfInts) {
        String[] strArray = stringOfInts.split(" ");
        long summ = 0;
        for (int i = 0; i < strArray.length; i+=1) {
            summ = summ += Integer.parseInt(strArray[i]);
        }
        return summ;
    }
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        double newP = p0 + p0 * percent * 0.01 + aug;
        int countYears = 1;
        while (newP < p){
           newP =  newP + newP * percent * 0.01 + aug;
           countYears++;
        }
       return countYears;
    }

    public static int[] reverse(int n){
        //your code
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n--;
        }
        return a;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) sum += arr[i];
        }
        return sum;
    }

    public static int makeNegative(final int x) {
        if (x <=0) return x;
        else return x * -1;
    }

                //ИНВЕРТИРУЕТ ЧИСЛА В МАССИВЕ ПО ЗНАКУ. ИЗ + -Ю ИЗ -+.
    public static int[] invert(int[] array) {
        int[] secondArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            secondArray[i] = array[i] * -1;
        }
        return secondArray;
    }

                // НАХОДИТ ПЕРВОЕ ЧИСЛО, КОТОРОЕ БОЛЬШЕ ЧЕМ НА ЕДИНИЦУ ОТ ПРЕДЫДУЩЕГО
    static Integer find(final int[] array) {
        Integer a = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1]-array[i] != 1)
            a = array[i+1];
            if (a != 1) break;
        }
       if (a == 1) return null;
       else return a;
    }


}
