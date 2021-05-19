package com.company.differents;

public class ArraysTests {
    public static void main(String[] args) {
        char[][] biArray = new char[128][15];
        int simvol = 0;
        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[0].length; j++) {
                biArray[i][j] = (char) simvol;
            }
            simvol++;
        }

        int count = 1;
        for (int i = 0; i < biArray.length; i++) {
            System.out.print(count + " ");
            for (int j = 0; j < biArray[0].length; j++) {
                System.out.print(biArray[i][j] + " ");
            }
            count++;
            System.out.println();
        }
    }
}
