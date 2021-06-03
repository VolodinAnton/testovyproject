package com.company.MultithreadingQuest.Multithreading.Executor_Callable_Future;

import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(new Runnable() {
            public void run() {
                System.out.println("I'm anonymous class");
            }
        });
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.submit(new MyRunnable());

        executorService.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm from MyRunnable");
    }
}

class MyCallable implements Callable {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "I'm from MyCallable";
    }
}
