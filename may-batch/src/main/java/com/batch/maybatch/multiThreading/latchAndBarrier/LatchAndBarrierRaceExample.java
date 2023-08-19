package com.batch.maybatch.multiThreading.latchAndBarrier;

import com.batch.maybatch.oops.constructors.A;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class LatchAndBarrierRaceExample {


    public static void main(String[] args) throws InterruptedException{
        int players = 3;

        //start-collection
        ConcurrentLinkedQueue<String> positions = new ConcurrentLinkedQueue<>();
        //end-collection

        CountDownLatch latch = new CountDownLatch(players);


        Runnable startTheRace = () ->{
            System.out.println("All players ready for race, shooting the gun.");
        };

        CyclicBarrier barrier = new CyclicBarrier(players, startTheRace);


        Runnable raceTask = getRaceTask(latch, barrier, positions);

        for(int i = 0; i < players ; i++){
            new Thread(raceTask).start();
        }


        latch.await();
        //start-collection
        AtomicInteger  i = new AtomicInteger(0);
        positions.forEach(winner -> System.out.println("At " + i.incrementAndGet() + " postion " + winner));
        //end-collection

    }


    public static Runnable getRaceTask(  CountDownLatch latch , CyclicBarrier barrier, ConcurrentLinkedQueue<String> positions ){
      return   () ->{
            System.out.println(Thread.currentThread().getName() + " ready for race ");
            try {
                Thread.sleep(2000);
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

             positions.add(Thread.currentThread().getName());
             latch.countDown();
        };
    }
}
