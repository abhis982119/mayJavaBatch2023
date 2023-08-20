package com.batch.maybatch.collection.set.hashset;

import lombok.SneakyThrows;

import java.util.HashSet;
import java.util.Set;

public class BasicProperties {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,3,1,null,2};

        Set<Integer> hashset = new HashSet<>();

        for(Integer value : arr){
            System.out.println("inserting value : " + value);
            hashset.add(value);
            System.out.println("current set: " + hashset);
            waitForSecond(10000);
        }

        System.out.println();
        System.out.println("final set : " + hashset);
    }

    @SneakyThrows
    public static void waitForSecond(int second){
        Thread.sleep(second);
    }
}
