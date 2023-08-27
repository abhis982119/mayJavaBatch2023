package com.batch.maybatch.streamsOperations;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int  sum = 0;
        sum =  Arrays.stream(arr).sum();
        System.out.println("Arrays.stream(arr).sum() :   " + sum);

        sum = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
        System.out.println("Arrays.stream(arr).reduce(0, (a,b)-> a+b) : " + sum );

        sum =  Stream.of(1,2,3).reduce(0, Integer::sum);
        System.out.println("Stream.of(1,2,3).reduce(0, Integer::sum) : " + sum);

   }
}
