package com.batch.maybatch.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListBasicCharactersticks {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        int[] a = new int[4];

        //Heterogeneous data allowed
        list.add(1);
        list.add("2");
        list.add('3');
        list.add(Boolean.TRUE);

        //null insertion allowed
        list.add(null);

        // duplicate allowed
        list.add(1);
        list.add("2");

        // insertion order is preserved




        System.out.println(list);

    }
}
