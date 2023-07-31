package com.batch.maybatch.multiThreading.singletonPattern;

public class Employee {

    private int empId;


    @Override
    public int hashCode(){
        return empId;
    }
}
