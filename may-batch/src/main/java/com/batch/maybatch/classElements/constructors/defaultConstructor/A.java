package com.batch.maybatch.classElements.constructors.defaultConstructor;

import java.util.Date;

public class A {

    static  int  age = 28;
    int salary = 200000;

   // 16 - 25
  //  ashish
  //

    // 16 17 18 19 20 21 22 23 24 25 //

  public static void main(String[] args){
      int startDate = 16;
      int endDate = 25;

      // include Both corner date  x+y+1
      int totalDays = endDate - startDate + 1;

      //include one corner date

      totalDays =   endDate - startDate;


      //both exclude
      totalDays = endDate - startDate -1;

  //                        s         e
      int[] arr = new int[]{1,2,3,4,5,6,}; //2

      int sizeInByte = 4;
      int arrStartIndex = 20;
      int arrEndIndex = 44;

      int numberOfElementsInArray = 10;
      System.out.println("Number of elements : ");


  }

  //     Heap
  //  4 8 12 16 20  24 28  32  36  40  44  48
  //[ x x x  x  1   2   3  4   5   6   x    x  ]   //52


}
