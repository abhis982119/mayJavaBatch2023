package com.batch.maybatch.collection.map.hashEqualsContract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompareTest {

        public static void main(String[] args) {
            Map<String, String> map = new HashMap<>();
            map.put("India", "Delhi");
            map.put("China", "Beijing");

            String newKey = "India";
            Set<Map.Entry<String,String>> entries = map.entrySet();


             for(Map.Entry<String , String> entry : entries){
                 if(entry.getKey().equals(newKey)){
                     System.out.println("Update new data");
                 }else{
                     System.out.println("Enter new data");
                 }
             }

            for(Map.Entry<String , String> entry : entries){
                if( newKey.equals(entry.getKey())){
                    System.out.println("Update new data");
                }else{
                    System.out.println("Enter new data");
                }
            }
    }
}
