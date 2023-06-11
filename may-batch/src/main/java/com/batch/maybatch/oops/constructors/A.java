package com.batch.maybatch.oops.constructors;

public class A  {

    private int a = 10;


    public A(int value) {
        System.out.println("parametrized Constructor of A");
        this.a = value;
    }

    public void m2(){
        System.out.println("A-m2()");
    }

}
