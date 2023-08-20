package com.batch.maybatch.collection.map.treemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BasicProperties {

    public static void main(String[] args) {
        Map<String, String> countriesWithCaptial = new TreeMap<>();
        countriesWithCaptial.put("India", "Delhi");
        countriesWithCaptial.put("America", "Washington D.C");
        countriesWithCaptial.put("China", "Beijing");


        countriesWithCaptial.put("India", "New Delhi"); // duplicated keys values are updated
        countriesWithCaptial.put("X", "New Delhi");   //  duplicated keys values are updated


        countriesWithCaptial.put("NullKey", null);  // duplicate values of null accepted


        System.out.println(countriesWithCaptial);
    }
}
