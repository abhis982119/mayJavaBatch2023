package com.batch.maybatch.multiThreading.latchAndBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class BarrierExample {

    public static void main(String[] args) {

        AtomicInteger position = new AtomicInteger(0);


      Runnable startTheRace = () ->{
          System.out.println("All players ready for race, shooting the gun.");
      };

        int players = 3;
        CyclicBarrier barrier = new CyclicBarrier(players, startTheRace);


        Runnable raceTask = () ->{
            System.out.println(Thread.currentThread().getName() + " ready for race ");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + "  is at position " + position.incrementAndGet());
        };

        for(int i = 0; i < players ; i++){
           new Thread(raceTask).start();
        }


    }
}
