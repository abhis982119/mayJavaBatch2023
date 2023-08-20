package com.batch.maybatch.collection.set.linkedhashset;

import lombok.SneakyThrows;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BasicProperties {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,3,1,null,2};

        Set<Integer> hashset = new LinkedHashSet<>();

        for(Integer value : arr){
            hashset.add(value);
        }


        System.out.println("final set : " + hashset);
    }


}
