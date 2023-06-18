package com.batch.maybatch.stringsInjava.mystring.animal;

public class StringConstantPool {

    /*

    @AllArgsconstructor
      public class A{

        private String name;


      }

      public class Runner {

      public static void main(Stirng[] arggs){
      A abhishek = new A("Abhishek");
      A ashish = new A("Abhishek");



     */
    public static void main(String[] args) {

        String s1 = "abc";  //  1 object   // String Constant Pool
        String s2 = "def";   //  1 object
        String s3 = "abc";    //  0 object
        String s4 = new String("abc");   //  1 object  // heap memory
        s1.concat("def"); // 1 object

        if(s1 == s3){
            System.out.println(" s1 & s3 both string are same");
        }else{
            System.out.println(" s1 & s3 both string are not same");
        }


        if(s1 == s4){
            System.out.println(" s1 & s4 both string are same");
        }else{
            System.out.println(" s1 & s4  both string are not same");
        }

      /*
              4       10
      scp : {"abc", "def" }

       */

    }


    /*

       Oops


     */
}

