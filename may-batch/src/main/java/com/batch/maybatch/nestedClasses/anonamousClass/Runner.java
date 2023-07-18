package com.batch.maybatch.nestedClasses.anonamousClass;

public class Runner {

    public static void main(String[] args) {

        A a = new A();
        a.m1();


        //Child class with overriden method of m1() : B-m2()
        A b = new B();
        b.m1();



        //Child class with overriden method of m1() : C-m2()
        A c = new A(){
            @Override
            public void m1(){
                System.out.println("C-m1()");
            }

        };

        c.m1();
        c.m2();
        System.out.println("c salary : " + c.salary);

    }
}
