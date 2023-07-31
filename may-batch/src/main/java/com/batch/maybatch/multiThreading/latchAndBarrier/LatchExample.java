package com.batch.maybatch.multiThreading.latchAndBarrier;

import com.batch.maybatch.oops.constructors.C;
import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class LatchExample {


    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);


        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " work complete");
            latch.countDown();
        };

        for( int i = 0; i < 100 ; i++) {
            new Thread(task).start();
        }

        latch.await();


        System.out.println("print it after all thread work ends.");
    }
}
