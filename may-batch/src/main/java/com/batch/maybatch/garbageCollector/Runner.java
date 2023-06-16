package com.batch.maybatch.garbageCollector;

import lombok.SneakyThrows;

public class Runner {

    public static void main(String[] args) {

        A a = new A();
        a = null;

        System.gc();  // request GC to start

        wait(5);

    }




    @SneakyThrows
    public static void wait(int seconds){
        Thread.sleep(seconds*1000);
    }
}
