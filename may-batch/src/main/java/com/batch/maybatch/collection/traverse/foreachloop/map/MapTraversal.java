package com.batch.maybatch.collection.traverse.foreachloop.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTraversal {


    public static void main(String[] args) {
        Map<String, String> countriesWithCaptial = new HashMap<>();
        countriesWithCaptial.put("India","Delhi");
        countriesWithCaptial.put("America", "Washington D.C");
        countriesWithCaptial.put("China", "Beijing");




         //legacy for-each loop 1.5
         System.out.println("Legacy for-each loop");
          for(Map.Entry<String,String> entry  : countriesWithCaptial.entrySet()){
              System.out.println(entry);
          }

          //for-each loop 1.8
           System.out.println("for-each after converting it into set");
           countriesWithCaptial.entrySet().forEach(System.out::println);


           //stream
          System.out.println("Stream after converting it into set");
          countriesWithCaptial.entrySet().forEach(System.out::println);


        System.out.println("Travering map using keyset");
       for( String key : countriesWithCaptial.keySet()){
           System.out.println(key + "=" + countriesWithCaptial.get(key));
       }

        System.out.println("All capital values ");
        for(String captials :  countriesWithCaptial.values() ) {
           System.out.println(captials);
       }
    }
}
