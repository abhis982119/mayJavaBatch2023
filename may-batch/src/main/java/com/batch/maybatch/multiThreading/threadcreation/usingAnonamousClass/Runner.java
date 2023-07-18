package com.batch.maybatch.multiThreading.threadcreation.usingAnonamousClass;

public class Runner {


    public static void main(String[] args) {
        System.out.println("main thread start");
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("a1");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("main thread ends"); // main thread ends

    }
}
