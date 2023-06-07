package com.batch.maybatch.oops.polymorphism.overloading.methodoverloading;

public class TypeCasting {

    public static void main(String[] args){
        short s = 5;
        System.out.println("value of byte  " + s);

         byte b = (byte)s;

        System.out.println("value of short : " + b);



        byte e  = 126;
        byte f  = 126;
        System.out.println(" sum is " + (byte)(e+f));

    }
}
