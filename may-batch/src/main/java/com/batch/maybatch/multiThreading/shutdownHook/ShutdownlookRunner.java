package com.batch.maybatch.multiThreading.shutdownHook;

import lombok.SneakyThrows;

public class ShutdownlookRunner {

    @SneakyThrows
    public static void main(String[] args) {

        Runnable dbCleanUpTask = () -> {
            System.out.println("All db connection closed");
        };
        Thread dbCleanUpThread = new Thread(dbCleanUpTask);

        Thread printLogErrorTask = new Thread (  () -> System.out.println("created machine down logs file. ") );

        Runtime runtime = Runtime.getRuntime();

        runtime.addShutdownHook(dbCleanUpThread);
        runtime.addShutdownHook(printLogErrorTask);
        runtime.addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.out.println(" Sending alert to LV5 engineers ");
            }
        });


        for(int i = 0 ; i < 10 ; i++){
            System.out.println("counter : " + i);
            Thread.sleep(1000);
            if(i == 5){
                System.exit(1);
            }
        }


    }
}
