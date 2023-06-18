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



        String str1 = new String("abc");
        String str2 = new String("abc");

        if(str1 == str2){
            System.out.println("both string same");
        }else{
            System.out.println("both string  not same");
        }


        if(str1.equals(str2)){  //string class overrides the equal method to value comparison
            System.out.println("both  string with equals same");
        }else{
            System.out.println("both string with equals  not same");
        }


        Integer g = new Integer(10);
        Integer f = new Integer(10);

        if(g == f){
            System.out.println("both Integer same");
        }else{
            System.out.println("both Integer  not same");
        }


        if(g.equals(f)){
            System.out.println("both  Integer with equals same");
        }else{
            System.out.println("both Integer with equals  not same");
        }


    }
}
