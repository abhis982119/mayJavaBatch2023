package com.batch.maybatch.streamsOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSumOfIntegerAboveX {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());


       int sumOfNumberGreaterThan2 =  list.stream()
                .filter(value -> value > 2)
                .reduce(0, (a,b) -> a+b);


       //same as above implementation but using static method
          sumOfNumberGreaterThan2 =  list.stream()
                .filter(value -> value > 2)
                .reduce(0, Integer::sum);






    }
}
