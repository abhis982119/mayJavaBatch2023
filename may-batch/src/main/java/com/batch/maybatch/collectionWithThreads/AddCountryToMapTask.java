package com.batch.maybatch.collectionWithThreads;

import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;


public class AddCountryToMapTask implements Runnable {

    private String country;
    private String capital;

    private Map<String, String> countriesWithCapital;

    final private CountDownLatch latch;

    private CyclicBarrier barrier;

    private final Lock lock  ;


    public AddCountryToMapTask(String country, String capital, Map<String, String> countriesWithCapital, CountDownLatch latch, CyclicBarrier barrier, Lock lock) {
        this.country = country;
        this.capital = capital;
        this.countriesWithCapital = countriesWithCapital;
        this.latch = latch;
        this.barrier = barrier;
        this.lock = lock;
    }

    @Override
    public void run() {
        waitForBarrierToBeBroken();

        lock.lock();
       if( countriesWithCapital.containsKey(country) ) {
         //  System.out.println("Key already exist, not putting India with capital : " + capital);
           latch.countDown();
           lock.unlock();
           return;
       }

        String value =  countriesWithCapital.putIfAbsent(country, capital);
        if(value == null) {
            System.out.println("added country " + country + " with capital " + capital);
        }

        lock.unlock();
        latch.countDown();
    }

    public void waitForBarrierToBeBroken() {
        try {
            barrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
