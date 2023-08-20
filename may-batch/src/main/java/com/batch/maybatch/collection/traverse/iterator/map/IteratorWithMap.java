package com.batch.maybatch.collection.traverse.iterator.map;

import java.util.HashMap;
import java.util.Map;

public class IteratorWithMap {

    public static void main(String[] args) {
        Map<String, String> countriesWithCaptial = new HashMap<>();
        countriesWithCaptial.put("India","Delhi");
        countriesWithCaptial.put("America", "Washington D.C");
        countriesWithCaptial.put("China", "Beijing");


      //   countriesWithCaptial.itr  : No iterator for map

    }
}
