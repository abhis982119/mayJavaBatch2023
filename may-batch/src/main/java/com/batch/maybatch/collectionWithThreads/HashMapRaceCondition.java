package com.batch.maybatch.collectionWithThreads;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HashMapRaceCondition  {
    public static void main(String[] args) {
        // Create a shared HashMap
        Map<String, Integer> hashMap = new ConcurrentHashMap<>();

        // Create two threads that simultaneously add elements to the HashMap
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put("Key" + i, i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                hashMap.put("Key" + i, i);
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the size of the HashMap
        System.out.println("HashMap size: " + hashMap.size());
    }
}
