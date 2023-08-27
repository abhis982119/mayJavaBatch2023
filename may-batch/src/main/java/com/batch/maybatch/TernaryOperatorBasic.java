package com.batch.maybatch;

public class TernaryOperatorBasic {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        int max = a > b ? a : b ;

        //  boolean ? true : false;

      /*  if( a > b){
            max = a;
        }else {
            max = b;
        }*/

        System.out.println(max);
    }
}
