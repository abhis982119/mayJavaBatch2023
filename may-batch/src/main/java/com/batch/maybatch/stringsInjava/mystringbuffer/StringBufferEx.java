package com.batch.maybatch.stringsInjava.mystringbuffer;

public class StringBufferEx {
 //                 24               30
    /*            obj1            obj2
        String -> abc --concat--> abcd

                   24              24
                  obj1            obj1
  StringBuffer -> abc --append--> abcd
     */

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("abc");

        System.out.println("before append  " + sb);

          sb.append('d');

        System.out.println("after append  " + sb);


/*
        if( sb == updatedSb){
             System.out.println("both original and appended stringbuffer are same ");
         }else{
             System.out.println("both original and appended stringbuffer are not  same ");
         }*/

    }
}
