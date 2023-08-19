package com.batch.maybatch.collection.sorting.comparable.list;

import java.util.*;

public class WrapperClassesSort {

    public static void main(String[] args) {
        //List<String>  countries = Arrays.asList("India", "China", "America");
        List<Integer>  countries = Arrays.asList(5, 1, 19, 100, 12);

        Collections.sort(countries);

        System.out.println(countries);
    }
}
