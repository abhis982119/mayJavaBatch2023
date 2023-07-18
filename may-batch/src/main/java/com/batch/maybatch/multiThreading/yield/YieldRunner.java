package com.batch.maybatch.multiThreading.yield;

public class YieldRunner  extends  Object{


    public static void main(String[] args) {
        Runnable task = () -> {
            for( int i = 1; i <= 10; i++) {
                System.out.println(" Task completed  " + i
                         + " by : " + Thread.currentThread().getName()) ; // running
                Thread.yield();  // wait
            }
        }; //dead


        Thread ramesh = new Thread(task); // new
        Thread suresh = new Thread(task); // new

        ramesh.setName("Ramesh");
        suresh.setName("Suresh");

        ramesh.start();  // ready
        suresh.start();  // ready



    }
}
