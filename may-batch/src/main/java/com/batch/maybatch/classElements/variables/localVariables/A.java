package com.batch.maybatch.classElements.variables.localVariables;

public class A {

       static int staticVariable   = 10 ;   //static-variable
        int instanceVariable ;       //instance-variable

//method
  public  static int m1(){


      System.out.println("staticVariable variable : " +  staticVariable);
      return staticVariable;

   }


}










/*
    stack-2 : add()                  Heap                  Non-heap
-------------------
int a = 2, b = 3;
result = 5
-----------------

----------

-----------------

 */


