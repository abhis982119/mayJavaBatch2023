package com.batch.maybatch.multiThreading.threadcreation.extendsThread;

public class MyThreadRunner {

    public static void main(String[] args) {
        System.out.println("main thread starts"); // main thread

        MyThread thread = new MyThread();   // new
        thread.start();                     // ready
     //    thread.start();      // will throw IllegalTheradStateException

        System.out.println("main thread starts"); // thread
    }
}
