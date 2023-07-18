package com.batch.maybatch.multiThreading.threadName;

public class ThreadNameRunner {


    public static void main(String[] args) {
        Runnable printThreadName = () -> {
            System.out.println("Thead name :  "  + Thread.currentThread().getName());
        };

         Thread thread = new Thread(printThreadName);
         thread.setName("Ashish thread");
         thread.start();


     //Thread.sleep(2000);

    }
}
