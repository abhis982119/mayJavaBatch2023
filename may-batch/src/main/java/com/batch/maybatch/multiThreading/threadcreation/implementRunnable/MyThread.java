package com.batch.maybatch.multiThreading.threadcreation.implementRunnable;

import lombok.SneakyThrows;

public class MyThread implements Runnable{
    @Override
    @SneakyThrows
    public void run() {
        for(int count = 0; count < 10 ; count++) {// running
            Thread.sleep(1000);  // sleep
            System.out.println("current count : " + count);  // running
        }
    }

}
