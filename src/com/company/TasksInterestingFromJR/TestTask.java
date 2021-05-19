package com.company.TasksInterestingFromJR;

import java.io.*;

public class TestTask {
    public static void main(String[] args) {

            /*Округление чисел
    Считать с консоли 2 имени файла.
    Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
    Округлить числа до целых и записать через пробел во второй файл.
    Закрыть потоки.

    Принцип округления:
    3.49 => 3
    3.50 => 4
    3.51 => 4
    -3.49 => -3
    -3.50 => -3
    -3.51 => -4


    Требования:
    1. Программа должна два раза считать имена файлов с консоли.
    2. Для первого файла создай поток для чтения. Для второго - поток для записи.
    3. Считать числа из первого файла, округлить их и записать через пробел во второй.
    4. Должны соблюдаться принципы округления, указанные в задании.
    5. Созданные для файлов потоки должны быть закрыты.*/
        String fileOne = "";
        String fileTwo = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileOne = reader.readLine();
            fileTwo = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        float a = 0;
        String f = "";
        int g = 0;

        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileOne)));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileTwo))))
         {
            while (inputReader.ready()) {
                out.write(Math.round(Float.parseFloat(inputReader.readLine())) + "\n");
               // System.out.println(Math.round(Float.parseFloat(inputReader.readLine())));
            }
         } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
