package com.batch.maybatch.multiThreading.producerConsumerProblem;

import lombok.SneakyThrows;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        PC pc = new PC();

        Producer producerTask = new Producer(pc);
        Thread producer = new Thread(producerTask);
        producer.setName("Producer");


        Consumer consumerTask = new Consumer(pc);
        Thread consumer = new Thread(consumerTask);
        consumer.setName("Consumer");


        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("unit produced :  " + pc.getUnitProduced());



        //producer
        //consumer


    }
}
