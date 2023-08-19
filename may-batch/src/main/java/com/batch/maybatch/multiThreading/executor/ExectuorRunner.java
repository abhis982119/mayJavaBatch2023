package com.batch.maybatch.multiThreading.executor;

import lombok.SneakyThrows;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class ExectuorRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " : task completed");
        };

       ExecutorService executorService =  Executors.newFixedThreadPool(3);

        for(int i = 0; i < 10 ; i++) {
            executorService.submit(task);
        }

    }
}
