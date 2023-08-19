package com.batch.maybatch.multiThreading.locks;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        PC pc = new PC();

        CompletableFuture.runAsync(pc::produce); //producer-THREAD
        CompletableFuture.runAsync(pc::consume); //consumer-Thread.

        Thread.sleep(20000);
    }
}
