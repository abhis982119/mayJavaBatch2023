package com.batch.maybatch.collectionWithThreads;

import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class AddCountryToMapTask implements Runnable {

    private String country;
    private String capital;

    private Map<String, String> countriesWithCapital;

    final private CountDownLatch latch;

    private CyclicBarrier barrier;


    public AddCountryToMapTask(String country, String capital, Map<String, String> countriesWithCapital, CountDownLatch latch, CyclicBarrier cyclicBarrier) {
        this.country = country;
        this.capital = capital;
        this.countriesWithCapital = countriesWithCapital;
        this.latch = latch;
        this.barrier = cyclicBarrier;
    }

    @Override
    public void run() {
        waitForBarrierToBeBroken();
       if( countriesWithCapital.containsKey(country) ) {
         //  System.out.println("Key already exist, not putting India with capital : " + capital);
           latch.countDown();
           return;
       }

        countriesWithCapital.put(country, capital);
        System.out.println("added country " + country + " with capital " + capital);
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
