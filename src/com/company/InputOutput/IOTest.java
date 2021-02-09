package com.company.InputOutput;

import java.io.*;
import java.util.Date;

public class IOTest {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Users/user/Desktop/Ира вещи/oferta-fl.pdf");
        OutputStream os = new FileOutputStream("C:/Users/user/Desktop/oferta-fl.pdf");

        Date d1 = new Date();
        int count = 0;
        while (is.available() > 0) {
            int data = is.read();
            os.write(data);
            count++;
        }

        Date d2 = new Date();

        is.close();
        os.close();

        System.out.println(d2.getTime()-d1.getTime());
        System.out.println("Скопировано " + count/1024 + " Кбайт");

        InputStream isBuf = new BufferedInputStream (new FileInputStream("C:/Users/user/Desktop/Ира вещи/oferta-fl.pdf"));
        OutputStream osBuf = new BufferedOutputStream (new FileOutputStream("C:/Users/user/Desktop/oferta-fl.pdf"));

        Date d3 = new Date();

        int count1 = 0;
        while (isBuf.available() > 0) {
            int data = isBuf.read();
            osBuf.write(data);
            count1++;
        }

        Date d4 = new Date();

        isBuf.close();
        osBuf.close();

        System.out.println(d4.getTime()-d3.getTime());
        System.out.println("Скопировано " + count1/1024 + " Кбайт");
    }
}
