package com.batch.maybatch.collection.traverse.foreachloop.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetTravesal {

    public static void main(String[] args) {
        Set<Integer> rollNumbers = new HashSet<>(Arrays.asList(1,2,3,4));

        //for-each loop : old
        System.out.println();
        System.out.println("Traversing through old for-each");
        for (Integer value : rollNumbers) {
            System.out.print(value + " ");
        }

        //new for-each loop
        System.out.println();
        System.out.println("New for-each 1.8");
        rollNumbers.forEach(rollNum -> System.out.print(rollNum + " "));


        //stream
        System.out.println();
        System.out.println("Streams for-each");
        rollNumbers.stream().
                forEach(rollNum -> System.out.print(rollNum + " "));

    }
}
