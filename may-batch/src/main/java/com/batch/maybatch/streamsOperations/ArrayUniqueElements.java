package com.batch.maybatch.streamsOperations;

import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayUniqueElements {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5,};

        List<Integer> distinctElements = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        System.out.println("distince values : " + distinctElements);


        //Make set first

        List<Integer> duplicateList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());


        distinctElements = duplicateList
                .stream()
                .distinct()
                .collect(Collectors.toList());


        //Convert into set to remove duplicate then convert into list

      distinctElements =   duplicateList.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());


      //But above could be performed directly using constructors

      distinctElements =   new ArrayList( new HashSet(duplicateList));


    }
}
