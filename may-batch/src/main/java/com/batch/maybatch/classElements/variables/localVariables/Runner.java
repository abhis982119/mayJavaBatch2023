package com.batch.maybatch.classElements.variables.localVariables;

import javafx.scene.SubScene;

public class Runner {

 public static void main(String[] args){

     System.out.println("Code starts here ! ");

     int b = 20;
     A a = new A();

     System.out.println("value of local variable : " + b);
     System.out.println("value of a.instanceVariable " +   a.instanceVariable); //instance- variable access
     System.out.println("value of a.staticVariable " +  A.staticVariable ); //static- variable access




 }




/*

Stack                             Heap                               Non-heap

main
--------                         87878675
      a ------------->           A{instanceVariable = 0, m1()}         A{staticVariable=20, m2() }
      b ------------->           A{instanceVariable = 0, m1()}
--------

 method call
 a.m1()
-------

--------











 */




}



    /*

                                   local                              instance                             static
         Memory allocation         method execution start          at the time of object creation     at time of class loading
         Memory de-allocate        method execution ends           at the time of object deletion     at time of class unloading
         Default values            not provided by jvm             default value provided by jvm     default value provided by jvm
         access-modifiers          not supported                      supported                       supported
         memory
         access
         binding

     */