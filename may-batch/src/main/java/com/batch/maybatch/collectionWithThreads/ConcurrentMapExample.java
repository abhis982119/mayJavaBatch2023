package com.batch.maybatch.collectionWithThreads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentMapExample {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(12);
        CyclicBarrier barrier = new CyclicBarrier(12, () ->{
            System.out.println("barrier broken");
        });

        Lock lock = new ReentrantLock();

        Map<String, String> countriesWithCapital = new HashMap<>();


        populateData(countriesWithCapital, latch, barrier, lock);

        latch.await();

        System.out.println(countriesWithCapital);

    }

    public static void populateData(Map<String, String> countriesWithCapital ,
                                    CountDownLatch latch,   CyclicBarrier barrier, Lock lock) {

        AddCountryToMapTask addCountryIndiaToMapTask =
                new AddCountryToMapTask("India", "Delhi", countriesWithCapital, latch,barrier, lock);
        Thread t1 = new Thread(addCountryIndiaToMapTask);

       for(int i = 0; i < 10; i++){
           Thread t2 = new Thread(new AddCountryToMapTask("India", "New Delhi", countriesWithCapital, latch,barrier, lock));
           t2.start();
       }

        Thread t3 = new Thread(
                new AddCountryToMapTask("China", "Beijing", countriesWithCapital, latch,barrier, lock));

        t1.start();

        t3.start();

    }
}

