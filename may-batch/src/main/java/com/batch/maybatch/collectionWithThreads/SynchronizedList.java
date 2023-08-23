package com.batch.maybatch.collectionWithThreads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SynchronizedList {

    public static void main(String[] args) throws InterruptedException {
        List<String>  l = new ArrayList<>();

       final List<String> list =  Collections.synchronizedList(l);


        CountDownLatch latch = new CountDownLatch(2);

        Runnable addIndiatask = () -> {
            if(list.add("India")){
                System.out.println("India successfully added");
                latch.countDown();
            }

        };

        Runnable addChinatask = () -> {

            if( list.add("China")){
                System.out.println("China successfully added");
                latch.countDown();
            }


        };


        Thread t1 = new Thread(addIndiatask);
        Thread t2 = new Thread(addChinatask);


        t1.start();
        t2.start();

        System.out.println("Both threads started.");

        latch.await();


        System.out.println(list);


    }
}
