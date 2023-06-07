package com.batch.maybatch.oops.polymorphism.overloading.methodoverloading;

public class MyMath {


// 127
    //  b > 11 --> error    (Multiplication)
    //  b >= 64 --> error   ( add )
/*
  long = 19 digit
  int = 10 digit

*/

    /*


     */


    public int add(int a , int b){
        return a+b;
    }




    public int add( byte a , byte b){
        return  a+ b ;
    }


    public int square(short s){
        System.out.println("short square is called ");
        return s*s;
    }

    public int square(int a){
        System.out.println("int square is called ");
        return a*a;
    }

    public long square(long l){
        System.out.println("long square is called ");
        return l*l;
    }





    public float square(float f){
        System.out.println("Float method called : " );
        return f*f;
    }

    public double square(double d){
        System.out.println("Double method called : " );
        return d*d;
    }






























    /*

    public int add(int a, int b){
        System.out.println(" two  int parameter add called ");
        return a+b;
    }

    public double add(double a, double b){
        System.out.println(" two double parameter add called ");
        return  a+b;
    }










    public int add(int a , int b , int c){
        System.out.println(" three parameter add called ");
        return a+b+c;
    }


    public int add(int a , int b , int c, int d){
        System.out.println(" four parameter add called ");
        return a+b+c+d;
    }
*/



}
