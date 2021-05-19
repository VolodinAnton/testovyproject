package com.company.InputOutput;

import java.io.*;

public class FromOneFileTOAnother {
    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        byte[] a;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputReader = new FileInputStream(file1 = reader.readLine());
        FileInputStream inputReader2 = new FileInputStream(file2 = reader.readLine());
        FileOutputStream outputWriter = new FileOutputStream(file1);

        a = new byte[inputReader.available() + inputReader2.available()];



        inputReader.read(a, inputReader2.available(), inputReader.available());
        inputReader2.read(a, 0, inputReader2.available()-1);
        outputWriter.write(a);

        inputReader.close();
        inputReader2.close();
        outputWriter.close();


        char g = 103;

        System.out.println(file1);
        System.out.println(file2);
      /*  System.out.println(Arrays.toString(firstFile));
        System.out.println(Arrays.toString(secondFile));*/
        System.out.println(g);
    }

}



