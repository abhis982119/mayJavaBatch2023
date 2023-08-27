package com.batch.maybatch.streamModification;

import java.util.stream.IntStream;

public class MaxAndMinValueInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        int maxValue = IntStream.of(arr)
                .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);


        System.out.println("max-value :  " + maxValue);






        System.out.println("Math.max()");
         maxValue = IntStream.of(arr)
                .reduce(0, Math::max);


        System.out.println("max-value :  " + maxValue);


        System.out.println("Min value using Math.max");

       int minValue =   IntStream.of(arr)
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("min value : " + minValue);



    }

}
