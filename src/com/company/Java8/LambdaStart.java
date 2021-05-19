package com.company.Java8;

public class LambdaStart {
    public static void main(String[] args) {
        Runnable testRunnable = () -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() +  " " + Math.random() * 20);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        };

        Runnable runnable1 = () -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " " + Math.random() * 20);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        };

        Thread thread = new Thread(testRunnable);
        thread.start();


        Thread thread1 = new Thread(runnable1);
        thread1.start();

    }
}
