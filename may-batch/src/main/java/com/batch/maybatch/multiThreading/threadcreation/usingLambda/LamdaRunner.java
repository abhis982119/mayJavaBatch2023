package com.batch.maybatch.multiThreading.threadcreation.usingLambda;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class LamdaRunner {

    public static void main(String[] args) throws Exception {

        Runnable task =    () -> {

            for(int i = 0; i < 10; i++){
                System.out.println("counter : " + ++i);
            }
        };

        Thread thread1  = new Thread(task);
        thread1.start();


        Runnable printABC5TimesTask =  () -> {

                System.out.println("abc");
                System.out.println("abc");
                System.out.println("abc");
                System.out.println("abc");
                System.out.println("abc");


        };


        CompletableFuture.runAsync(printABC5TimesTask);


        Thread.sleep(20000);

    }
}
