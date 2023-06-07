package com.batch.maybatch.classElements.instanceBlock;

public class A {


    {                            //instance
        System.out.println("Instance-block of A");
    }

     public A(){   // constructor
        System.out.println("No-args constructor of A");
    }
   private  static int salary;   //variable

    private int age ;


    public static  void m1(){   // method

        int abc = 10;   //local-variable
        System.out.println("A-m1()");
    }

    public  void m2(){   // method
        System.out.println("A-m1()");
    }



    /*
       stack               heap                                        non-heap

                                                                     Runner{ main(String[] args)}

                     Car{ int fuel : 0, travel(){}  }          A{ int salary : 0 , m1(){}  }
                     Dog{ name : "Tommy"  }                    Dog{ breed : labrador   }


    */

}
