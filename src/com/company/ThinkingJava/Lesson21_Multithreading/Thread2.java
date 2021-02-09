package com.company.ThinkingJava.Lesson21_Multithreading;

//Здесь я создаю потоки на основе Thread. Еще один тестовый потокю

public class Thread2 extends Thread {

    public Thread2(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Here start Thread2. His name is " + Thread.currentThread().getName());

        System.out.println("Here finish " + Thread.currentThread().getName());


    }

}
