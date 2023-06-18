package com.batch.maybatch.stringsInjava.mystringbuffer;

public class StringBufferWithEqualsMethod {


    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        if(sb1 == sb2){
            System.out.println("sb1 & sb2 are  same");
        }else{
            System.out.println("sb1 & sb2 are not  same");
        }


        if(sb1.equals(sb2)){
            System.out.println("using equals : sb1 & sb2  are  same");
        }else{
            System.out.println(" using equals : sb1 & sb2 are not  same");
        }


    }



}
