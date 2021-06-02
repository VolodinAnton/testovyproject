package com.company.MultithreadingQuest.Multithreading;

public class ThreadJR {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();

        ServiceClass serviceClass = new ServiceClass();
        serviceClass.setDaemon(true);
        serviceClass.start();

    }
}

class ThreadTest extends Thread {
    private int count;

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Print variable count. Count is " + count);
            count++;
            try {
                System.out.println(this.getState());
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.getState());
        }

        System.out.println("/////////// FINISH //////////");
    }
}

class ServiceClass extends Thread {
    private int count;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Service class " + count);
            count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
