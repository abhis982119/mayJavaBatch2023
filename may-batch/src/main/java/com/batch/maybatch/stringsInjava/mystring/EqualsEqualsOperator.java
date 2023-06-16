package com.batch.maybatch.stringsInjava.mystring;

public class EqualsEqualsOperator {






    public static void main(String[] args) {

          int a = 10;
          int b = 10;   //

        if (a == b) {   // compares value for primitive datatype
            System.out.println("a & b are equals");
        } else {
            System.out.println("a & b are not  equals");
        }

        Integer c = new Integer(10);
        Integer d = new Integer(10);

        if (c == d) {   // compare reference value in heap memory
            System.out.println("c & d are equals");
            System.out.println("skip database entry");
        } else {
            System.out.println("c & d are not  equals");
            System.out.println(" put data in database ");
        }




        Integer e = new Integer(10);
        Integer f =  e;

        if (e == f) { // compare reference value in heap memory
            System.out.println("e & f are equals");
        } else {
            System.out.println("e & f are not  equals");
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
