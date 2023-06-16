package com.batch.maybatch.stringsInjava.mystring;

public class BasicStringOps {


    public static void main(String[] args) {

      /*   int a = 10;
         int b = 10;*/

        Integer a  = new Integer(10);
        Integer b  = a;

         if(a == b){
             System.out.println("a & b are equals");
         }else{
             System.out.println("a & b are not  equals");
         }


        /*

           == :  in case of object : compares the address  reference variable pointing to
                  compares values of primitive data type

  object: equals :  compares the address  reference variable pointing to


                          GC:
           0 0 0  0  0    1   0   0
           4 8 12 16 20  24  28   32
         [ 1 2 3  4   5   a  7    b  ]


     */

    }
}
