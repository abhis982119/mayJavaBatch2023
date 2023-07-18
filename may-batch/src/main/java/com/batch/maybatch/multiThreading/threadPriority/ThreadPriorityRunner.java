package com.batch.maybatch.multiThreading.threadPriority;

public class ThreadPriorityRunner {

    public static void main(String[] args) {
        Runnable takeOrderFromCustomerTask = () -> {
            System.out.println("order taken from customer " + Thread.currentThread().getName() +
                               " with priorityt : "  + Thread.currentThread().getPriority());
        };


        System.out.println("Current Thread " + Thread.currentThread().getName()  +
                           " with priority " +  Thread.currentThread().getPriority());

        Thread waiter1 = new Thread(takeOrderFromCustomerTask);
        waiter1.setName("Rajesh");
        waiter1.setPriority(Thread.MAX_PRIORITY);





        Thread waiter2 = new Thread(takeOrderFromCustomerTask);
        waiter2.setName("Suresh");
        waiter2.setPriority(11);


        Thread waiter3 = new Thread(takeOrderFromCustomerTask);
        waiter3.setName("Ramesh");



        waiter1.start();
        waiter2.start();
        waiter3.start();


    }
}
