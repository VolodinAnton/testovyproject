package com.company.ThinkingJava.Lesson21_Multithreading;

public class Thread3 extends Thread {

    public Thread3 (String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread started " + Thread.currentThread().getName());
        System.out.println(("Thread finished " + Thread.currentThread().getName()));
    }
}
