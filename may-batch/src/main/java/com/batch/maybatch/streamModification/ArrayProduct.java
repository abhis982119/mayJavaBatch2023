package com.batch.maybatch.streamModification;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayProduct {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        int product = 0;
        System.out.println("Using IntStream");
        product = IntStream.of(arr)
                .reduce(1, (a,b) -> a*b);

        System.out.println("product" + product);

        System.out.println("Using Arrays.asList().stream()");
        product = Arrays.asList(1,2,3)
                .stream()
                .reduce(1, (a,b) -> a*b );
        System.out.println("product" + product);


        System.out.println("Using Stream.of(1,2,3)");
        product =  Stream.of(1,2,3)
                  .reduce(1, (a,b) -> a*b );
        System.out.println("product" + product);
    }




}
