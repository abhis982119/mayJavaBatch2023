package com.batch.maybatch.classElements.instanceBlock;

public class Runner {

    public static void main(String[] args) {
      /*  A a = new A();
        a.m1();
        m1();*/
        A.m1();


        Runner runner = new Runner();
        runner.m1();
    }

    public void m1(){
        System.out.println("Runner-m1()");
    }


}
