package com.company.MultithreadingQuest.Multithreading;

public class SleepWaitJoinYield {
    public static void main(String[] args) {
        JoinClass joinClass = new JoinClass();
        Thread threadJoinClass = new Thread(joinClass);
        threadJoinClass.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }

        try {
            System.out.println("////////////" + Thread.currentThread().getName() + "//////////////");
            threadJoinClass.join(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        for (int i = 0; i < 100; i++) {
            System.out.println("Im from Main");
        }

    }
}

class JoinClass implements Runnable {
    int count;

    public void run() {
        while (count < 100){
            count++;
            System.out.println(count + " JoinClass");
        }
    }
}
