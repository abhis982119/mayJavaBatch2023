package com.batch.maybatch.multiThreading.producerConsumerProblem;

import lombok.SneakyThrows;

import java.util.LinkedList;

public class PC {

    private LinkedList<String> burgerQueue = new LinkedList<>();

    private int batchSize = 5;


    private int unitProduced = 0;

    private boolean  factoryClosed  = false;


    private int maxUnitToProduce = 10;

    public synchronized void produce() throws InterruptedException{
        while(unitProduced < maxUnitToProduce) {

            System.out.println(Thread.currentThread().getName() + " : got lock and about to start producing burgers.");

            //overflow condition check
            if (burgerQueue.size() == batchSize) {
                System.out.println(Thread.currentThread().getName() + " : Batch of burgers created, waiting : ");
                wait();
            }

            //producing burger until batch completes
            for (int i = 0; i < batchSize; i++) {
                String burger = "burger" + ++unitProduced;
                burgerQueue.add(burger);
                System.out.println(Thread.currentThread().getName() + " : produced : " + burger);
                sleepForSeconds(1);
            }

            notify();
        }

        if(unitProduced == maxUnitToProduce){
            factoryClosed = true;
        }

    }


    public synchronized  void consume() throws InterruptedException{

        while(true) {
            System.out.println(Thread.currentThread().getName() + " : got lock and about to sell burgers.");
            // underflow condition check
            if (burgerQueue.isEmpty()) {

                if(factoryClosed) {
                    System.out.println(Thread.currentThread().getName() + " : No burgers for selling and factory closed  :Going home. ");
                    return;
                }else{
                    System.out.println(Thread.currentThread().getName() + " : No burgers for selling , waiting : ");
                    wait();
                }
            }

            //selling burgers batch
            for (int i = 0; i < batchSize; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + burgerQueue.poll());
                sleepForSeconds(1);
            }

            notify();
        }
    }


    @SneakyThrows
    public static void  sleepForSeconds(int seconds){
        Thread.sleep(seconds* 1000L);
    }

    public int getUnitProduced() {
        return unitProduced;
    }
}
