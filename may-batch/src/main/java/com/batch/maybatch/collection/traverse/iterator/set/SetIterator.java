package com.batch.maybatch.collection.traverse.iterator.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {

    public static void main(String[] args) {
        Set<Integer> rollNumbers = new HashSet<>(Arrays.asList(1,2,3,4,1,2,3,4));

        Iterator<Integer> itr =  rollNumbers.iterator();


        //Iterator

        System.out.println("Traversing through iterator ");
        while(itr.hasNext()){
            System.out.print(itr.next() +" " );
        }


    }
}
