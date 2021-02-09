package com.company.ThinkingJava.Lesson21_Multithreading;

//Here I create thread with help interface Runnable
//Don't forget he is waiting 10 seconds before he will finish.

public class ThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Here START point instance ThreadRunnable1. His name is " + Thread.currentThread().getName());
        System.out.println("Здесь начинается поток");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Вот все охренели, что вдруг что-то еще появилось");
        System.out.println("Here END point instance ThreadRunnable1. His name is " + Thread.currentThread().getName());
    }
}
