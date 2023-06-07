package com.batch.maybatch.classElements.methods.instanceMethods;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyMath {


    private int age ;    //instance-variable

    private static boolean salary  ; // static-variable






    public  int add(int a, int b) {
         return a+b;
    }

    public void swap(int a, int b){
       int temp = a;         // temp = 2;
        a = b;                // a = 5
        b = temp;
    }

/*
   a = 2, b 5;
   temp = a;         // temp = 2;
   a = b;                // a = 5
   b = temp;             // b = 2


 */


    /*        */



}
