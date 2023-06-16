package com.batch.maybatch.garbageCollector;

public class A extends  Object{

    private int salary = 40000000;


    @Override
    public void finalize(){
        System.out.println("Started closing db connection  : "  );
        int b =  10/0;
        System.out.println("db connection successfully closed ");
    }


    //finalze() vs finally block    : Exception Hanlding, Multi-threading, Collections


    /*
                         GC:
           0 0 0  0  0    1   0   0
           4 8 12 16 20  24 28  32
         [ 1 2 3  4   5   A  7   8  ]
     */



}
