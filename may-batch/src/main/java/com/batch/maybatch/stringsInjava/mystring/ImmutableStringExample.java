package com.batch.maybatch.stringsInjava.mystring;

public class ImmutableStringExample {

    public static void main(String[] args) {
        String s1   = new String("abc");  // 6 byte

       String s2 = s1.concat("def") ;  // 12 byte
       String  s3 =  s2.substring(0,3);    // 6 byte

       System.out.println("substring : "+ s3);

       if(s1.equals(s3)){  // String equals methods overides the object methods to value comparison
           System.out.println("String and substring are same");
       }else{
           System.out.println("String and substring are not same");
       }


        if(s1 == s3){
            System.out.println("both string are same");
        }else{
            System.out.println("both string are not  same");
        }

       if(s1 == s2){
           System.out.println("both string are same");
       }else{
           System.out.println("both string are not  same");
       }

        System.out.println(s1);

    }
}
