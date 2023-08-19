package com.batch.maybatch.multiThreading.locks;

import lombok.SneakyThrows;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PC {

    private Queue<String> queue = new LinkedList<>();
    private final Lock lock  = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private int batchSize = 2;

    private int maxBurgerToBeProduced = 10;

    private int burgerCount;


    @SneakyThrows
    public  void produce()  {

        try {
            while(burgerCount < maxBurgerToBeProduced) {
                System.out.println("About to start producing");
                lock.lock();   // synchorized
                System.out.println("Acquired lock, now starting producing");

                for (int i = 0; i < batchSize; i++) {
                    String burger = "burger : " + ++burgerCount;
                    queue.add(burger);
                    System.out.println("Producer : " + burger);
                }

                condition.signal(); // notify()
                condition.await(); // wait()

            }
        }finally {
            lock.unlock();  // synchornized keyword method/block  over
        }
    }


    @SneakyThrows
    public void consume()  {
        while (!queue.isEmpty() || burgerCount < maxBurgerToBeProduced) {
            System.out.println("About to start consuming");
            lock.lock();  //synchronized
            System.out.println("Lock acquired for consumption");

            for (int i = 0; i < batchSize; i++) {
                System.out.println("Consumed : " + queue.poll());
            }

            condition.signal();
            condition.await();
        }
        lock.unlock();
    }
}
