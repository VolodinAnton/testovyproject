package com.company.MultithreadingQuest.Multithreading;

public class InterruptTest extends Thread {
    public static void main(String[] args) {
        InterruptTest interruptTest = new InterruptTest();
        System.out.println(interruptTest.isInterrupted());
        /*interruptTest.interrupt();
        System.out.println(interruptTest.isInterrupted());*/
        try {interruptTest.interrupt();
            throw new InterruptedException();}
        catch (InterruptedException e) {
            System.out.println(interruptTest.isInterrupted());
        }

    }
}
