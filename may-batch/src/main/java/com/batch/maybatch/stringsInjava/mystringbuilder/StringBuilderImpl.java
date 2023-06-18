package com.batch.maybatch.stringsInjava.mystringbuilder;

public class StringBuilderImpl {

    /*                 immutable     Thread-Safety
      String             yes            yes

      Stringbuffer       no             yes

      StringBuilder      no              no

     */


  /*

    sbuffer  = "Abc"
       t1 :  sb.append("d");    // abc + d
       t2 :     sb.append("e"); // abcd + e


       abcd || abced





      sbuilder  = "Abc"
       t1 :  sb.append("d");    // abc + d
       t2 :     sb.append("e"); // abc + e



   */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");

        System.out.println("before append  " + stringBuilder);

        stringBuilder.append('d');

        System.out.println("after append  " + stringBuilder);
    }
}
