package com.batch.maybatch.streamModification;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,1,2,3,4,5};

        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());


     List<Integer> distinctList =   list.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());


        List<Integer> distinctList2 = new ArrayList<>(new HashSet<>(list));


        Map<String,String>  map = new HashMap<>();


    }
}
