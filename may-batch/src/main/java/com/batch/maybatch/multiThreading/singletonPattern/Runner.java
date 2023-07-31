package com.batch.maybatch.multiThreading.singletonPattern;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
   //  EagerSingleton singleton = EagerSingleton.getInstance();


          Runnable task =  Singleton::getInstance;

          Thread rahul = new Thread(task);
          rahul.setName("rahul");
          rahul.start();


        Thread shayam = new Thread(task);
        shayam.setName("Shayam");
        shayam.start();


        Thread baburao = new Thread(task);
        baburao.setName("Baburao");
        baburao.start();


        Thread.sleep(2000);


    }
}
