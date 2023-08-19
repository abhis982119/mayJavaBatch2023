package com.batch.maybatch.collection.traverse.foreachloop.list;

import java.util.*;
import java.util.stream.Collectors;

public class ListTraversal {


    public static void main(String[] args) {
       // List<String> countries =  Arrays.asList("India", "China","Australia");


        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("China");
        countries.add("Australia");


        System.out.println("Fetching data using normal for-loop");


      //legacy-for-loop loop using for loop
      for(int i = 0 ; i < countries.size(); i++){
          System.out.println(countries.get(i));
      }



        //for-each  old : 1.5
        System.out.println("---Old forEach-----");
        for(String country : countries){
            System.out.println(country);
        }

        System.out.println("---New for-each-----");
        //for-each new : 1.8
        countries.forEach(System.out::println);



        System.out.println("---Stream-----");
        //stream
        countries.stream().forEach(System.out::println);


    }
}
