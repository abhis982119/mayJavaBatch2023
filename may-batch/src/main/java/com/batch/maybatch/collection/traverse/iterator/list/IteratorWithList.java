package com.batch.maybatch.collection.traverse.iterator.list;

import java.util.*;

public class IteratorWithList {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("China");
        countries.add("America");

       Iterator<String> itr =  countries.iterator();

        while(itr.hasNext()){
            String countryName = itr.next();
            System.out.println(countryName);
        }

        System.out.println(countries);


        //List-itertor :

      ListIterator<String> listItr =  countries.listIterator();
        while(listItr.hasNext()){
            String countryName = listItr.next();


            System.out.println(countryName);
        }

    }





}
