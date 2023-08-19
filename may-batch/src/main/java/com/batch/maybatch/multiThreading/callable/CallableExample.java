package com.batch.maybatch.multiThreading.callable;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.concurrent.*;


public class CallableExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> countNTask = () -> {
            Thread.sleep(10000);
            return 10;
        };


        ExecutorService executorService =  Executors.newFixedThreadPool(1);
        Future<Integer> sum =  executorService.submit(countNTask);

        System.out.println("total sum is : " + sum.get());
        executorService.shutdown();
    }
}
