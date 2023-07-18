package com.batch.maybatch.multiThreading.threadcreation.threadBasics;

public class TheadBasics {

    public static void main(String[] args) {

       Thread currentThread =  Thread.currentThread() ;
       String threadName = currentThread.getName();

 //       System.out.println("Thread name :  " + Thread.currentThread().getName());
        System.out.println("Thread name :  " +  threadName);


    }
}
