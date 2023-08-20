package com.batch.maybatch.collection.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BasicProperties {

    public static void main(String[] args) {
        Map<String, String> countriesWithCaptial = new LinkedHashMap<>();
        countriesWithCaptial.put("India", "Delhi");
        countriesWithCaptial.put("America", "Washington D.C");
        countriesWithCaptial.put("China", "Beijing");


        countriesWithCaptial.put("India", "New Delhi"); // duplicated keys values are updated
        countriesWithCaptial.put("X", "New Delhi");   //  duplicated keys values are updated

        countriesWithCaptial.put(null, null);   // null insertion allowed
        countriesWithCaptial.put(null, null);  //  duplicated keys values are updated

        countriesWithCaptial.put("NullKey", null);  // duplicate values of null accepted


        System.out.println(countriesWithCaptial);
    }
}
