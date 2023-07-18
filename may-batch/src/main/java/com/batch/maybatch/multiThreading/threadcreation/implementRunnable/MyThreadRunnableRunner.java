package com.batch.maybatch.multiThreading.threadcreation.implementRunnable;



public class MyThreadRunnableRunner {

    public static void main(String[] args) {
        System.out.println("main thread starts");
        Runnable  task = new MyThread();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("main thread ends");
    }
}
