package com.batch.maybatch.multiThreading.synchronizeKeywoed.synchronizedMethod;

import com.batch.maybatch.oops.constructors.C;
import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        Cake cake = new Cake(2);



        Runnable cakeEatingTask = () -> {
           cake.consumeCake();
        };


        /*    get    set
         t1 : 2      1
         t2 : 2      1
         t3 : 2      1
         t4 : 2      1

         */



        Thread ramesh = new Thread(cakeEatingTask );
        ramesh.setName("ramesh");
        Thread suresh = new Thread(cakeEatingTask);
        suresh.setName("suresh");
        Thread rajesh = new Thread(cakeEatingTask );
        rajesh.setName("rajesh");
        Thread mahesh = new Thread(cakeEatingTask);
        mahesh.setName("mahesh");

        ramesh.start();
        suresh.start();
        rajesh.start();
        mahesh.start();

        Thread.sleep(1000);

        System.out.println(cake);

    }
}
