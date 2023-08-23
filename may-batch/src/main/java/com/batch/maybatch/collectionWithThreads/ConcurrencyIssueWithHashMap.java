package com.batch.maybatch.collectionWithThreads;

import com.batch.maybatch.oops.constructors.C;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrencyIssueWithHashMap {


    public static void main(String[] args) throws InterruptedException {

     //   Map<Integer,String> connectedCandidates = new ConcurrentHashMap<>();
        Map<Integer,String> hm = new HashMap<>();
        Map<Integer,String> connectedCandidates = Collections.synchronizedMap(hm);
        CountDownLatch latch = new CountDownLatch(2000000);

       Thread thread1 =  new Thread() {
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    connectedCandidates.put(i, "");
                    latch.countDown();
                }
            }
        };

      Thread thread2 = new Thread(){
            public void run(){
                for(int i = 1000000 ; i < 2000000; i++){
                    connectedCandidates.put( i,"");
                    latch.countDown();
                }
            }
        };

      long startTime = System.currentTimeMillis();
       thread1.start();
       thread2.start();


        latch.await();
        System.out.println(connectedCandidates.size());

        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken : " + (endTime-startTime) );
    }


}

/*
userid = 110;
amount  = amount-20;
 */