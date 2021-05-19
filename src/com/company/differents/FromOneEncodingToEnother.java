package com.company.differents;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FromOneEncodingToEnother {
    public static void main(String[] args) throws IOException {

        String fileNameInWindows1251Encoding = "C:\\Users\\user\\Desktop\\1.txt";
        String fileNameInUTF8Encoding = "C:\\Users\\user\\Desktop\\2.txt";
        StringBuilder sb = new StringBuilder("");
        String fileContent = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameInWindows1251Encoding)))) {
            while (reader.ready()) {
                sb.append(reader.readLine()).append("\n");
            }
        }

        fileContent = sb.toString();

        Charset UTF_8 = Charset.forName("UTF-8");
        byte[] arrayOut = fileContent.getBytes(UTF_8);
        String outString = new String(arrayOut, StandardCharsets.UTF_8).trim();

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileNameInUTF8Encoding)))) {
            writer.write(outString);
        }
    }
}
