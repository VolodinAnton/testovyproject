package com.company.differents;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CountOfBytes {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        byte[] fromFile;
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            fromFile = new byte[inputStream.available()];
            inputStream.read(fromFile);
        }
        int countOfByte = 0;
        int minCountOfBytes = fromFile.length;

        List<Integer> listInteger = new ArrayList<>();
        List <Byte>   listBytes = new ArrayList<>();

        for (int i = 0; i < fromFile.length; i++) {

            for (int j = 0; j < fromFile.length; j++) {
                if (fromFile[i] == fromFile[j]) ++countOfByte;  //посчитаю количество данного конкретного байта

            }

            if (countOfByte < minCountOfBytes) minCountOfBytes = countOfByte;

            listInteger.add(countOfByte);
            listBytes.add(fromFile[i]);

            countOfByte = 0;
        }

        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < listInteger.size(); i++) {
            if (listInteger.get(i) == minCountOfBytes) characters.add((char)(byte)listBytes.get(i));
        }

        Set<Character> characterSet = new LinkedHashSet<>(characters);


        for (Character a : characterSet
             ) {
            System.out.print(a + " ");
        }


       /* for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("Символ " + (char)(byte)listBytes.get(i) + " повторяется " + listInteger.get(i) + " раз");
            System.out.println("Минимальное количество повторов " + minCountOfBytes);
        }

        System.out.println(minCountOfBytes);*/
    }
}
