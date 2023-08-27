package com.batch.maybatch.streamModification;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());


        int sum = 0;

        System.out.println("Using For-each loop ");
        for(Integer value : arr){
            sum += value;
        }

        System.out.println("sum : " + sum);


        System.out.println("Using Arrays.stream(arr).sum() ");
        sum =  Arrays.stream(arr).sum();
        System.out.println("sum : " + sum);


        System.out.println("Using reduce on primitive array");
        sum = Arrays.stream(arr)
                .reduce(0, (a,b) -> a+b);

        System.out.println("sum : " + sum);


        System.out.println("Using reduce on list");
        sum = list.stream()
                .reduce(0, (a,b) -> a+b);

        System.out.println("sum : " + sum);



        System.out.println("Using reduce with (a,b) -> Integer.sum(a,b) ");
        sum = Arrays.stream(arr)
                .reduce(0,(a,b) -> Integer.sum(a,b));

        System.out.println("sum : " + sum);


        System.out.println("Using reduce with Integer::sum ");
        sum = Arrays.stream(arr)
                .reduce(0, Integer::sum);

        System.out.println("sum : " + sum);











    }
}
