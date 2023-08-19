package com.batch.maybatch.collection.list.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BasicCharacterstics {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();

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
