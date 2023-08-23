package com.batch.maybatch.collectionWithThreads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class ConcurrentMapExample {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(1002);
        CyclicBarrier barrier = new CyclicBarrier(1002, () ->{
            System.out.println("barrier broken");
        });

        Map<String, String> countriesWithCapital = new HashMap<>();


        populateData(countriesWithCapital, latch, barrier);

        latch.await();

        System.out.println(countriesWithCapital);

    }

    public static void populateData(Map<String, String> countriesWithCapital , CountDownLatch latch,   CyclicBarrier barrier) {

        AddCountryToMapTask addCountryIndiaToMapTask =
                new AddCountryToMapTask("India", "Delhi", countriesWithCapital, latch,barrier);
        Thread t1 = new Thread(addCountryIndiaToMapTask);

       for(int i = 0; i < 1000; i++){
           Thread t2 = new Thread(new AddCountryToMapTask("India", "New Delhi", countriesWithCapital, latch,barrier));
           t2.start();
       }

        Thread t3 = new Thread(
                new AddCountryToMapTask("China", "Beijing", countriesWithCapital, latch,barrier));

        t1.start();

        t3.start();

    }
}

