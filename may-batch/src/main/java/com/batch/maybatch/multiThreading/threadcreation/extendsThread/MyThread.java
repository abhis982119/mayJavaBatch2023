package com.batch.maybatch.multiThreading.threadcreation.extendsThread;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.SneakyThrows;

public class MyThread extends Thread{

    @Override
    @SneakyThrows
    public void run()  {
        for(int count = 0; count < 10 ; count++) {// running
            Thread.sleep(1000);  // sleep
            System.out.println("current count : " + count);  // running
        }
    }  // dead



}
