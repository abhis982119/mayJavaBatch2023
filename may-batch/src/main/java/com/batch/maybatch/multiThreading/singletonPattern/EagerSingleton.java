package com.batch.maybatch.multiThreading.singletonPattern;

public class EagerSingleton {
    private static final EagerSingleton single = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return single;
    }

    public int add(int a, int b){
        return a+b;
    }

}