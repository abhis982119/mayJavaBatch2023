package com.batch.maybatch.collection.map.hashEqualsContract;

import java.util.HashMap;
import java.util.Map;

public class HashEqualsBasicExample {

    public static void main(String[] args) {
        Map<String, String>  countriesWithCaptial = new HashMap<>();

        String india = new String("India");
        String indiaCapital = new  String("Delhi");

        String china = new String("China");
        String chinaCapital = new String("Beijing");

        String unknownCountry = new String("India");

        System.out.println("india " + india.hashCode());
        System.out.println("unknown " + unknownCountry.hashCode());

        countriesWithCaptial.put(india,indiaCapital);
        countriesWithCaptial.put(china,chinaCapital);
        countriesWithCaptial.put(unknownCountry, indiaCapital);





        countriesWithCaptial.entrySet().forEach(System.out::println);
    }
}
