package com.company.MultithreadingQuest.Multithreading.Executor_Callable_Future;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int count = 0;
                for (int j = 0; j < Math.random() * 10; i++) {

                    Future<String> future = es.submit(new SomeClassCallable());
                    count++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted exception occurred");
                    }
                    System.out.println(future.get() + " I repeated " + count + " times");
                }

        }

        System.out.println("/////////// FINISH //////////");

        es.shutdown();
    }
}

class SomeClassCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        return "I'm new instance of SomeClassCallable.";
    }
}