package com.company.ThinkingJava.Lesson21_Multithreading;

//Здесь я создаю потоки на основе Thread.

public class JThread extends Thread {

    public JThread (String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Thread started " + Thread.currentThread().getName());
        System.out.println("My priority is " + Thread.currentThread().getPriority());
        System.out.println("My state is " + Thread.currentThread().getState());
        for (int i = 0; i < 5; i++) {
            System.out.println("Я внутри потока " + 1);
        }

        System.out.println(("Thread finished " + Thread.currentThread().getName()));
    }
}


