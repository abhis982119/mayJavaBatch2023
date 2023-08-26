package com.batch.maybatch.multiThreading.threadLocal;

import com.batch.maybatch.collection.entity.Student;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalExample {

        private int value;
    public static void main(String[] args) {
        ThreadLocal<Integer> localInt =  ThreadLocal.withInitial(()->10);

              /*  Callable <Integer> task = () -> {
                    return 10;
                };
                */

        Runnable setCabFare = () ->{
             //a = 10;
            localInt.set(100);
            System.out.println("cab fare : " + localInt.get());
        };

        Runnable setBikeFare = () ->{
            localInt.set(50);
            System.out.println("bike fare : " + localInt.get());
        };

        Thread cabRide = new Thread(setCabFare);
        Thread bikeRide = new Thread(setBikeFare);


        bikeRide.start();
        cabRide.start();

        System.out.println("value : " +  localInt.get());
       }



    public void  initialValue(Callable<Integer> task) throws Exception {
        value = task.call();
    }
}
