package com.batch.maybatch.stringsInjava.mystring;

public class ObjectEqualMethod {

    public static void main(String[] args) {


       Student naresh = new Student(1, "Naresh", 4,"Hyderabad");
       Student ashish = new Student(2, "Ashish", 4, "Ghaziabad");

       Student ashish2 = new Student(2, "Ashish", 4, "Ghaziabad");



       if(naresh.equals(ashish)){
           System.out.println("both students not same");
       }else{
           System.out.println("both students are  not same");
       }

/*
        public boolean equals(Object obj) {
            return (this == obj);
        }

 */

        if(ashish2.equals(ashish)){
            System.out.println("   ashish1 &  ashish2 both students  same");
        }else{
            System.out.println(" ashish1 &  ashish2 both students are  not same");
        }




    }



    public void m1(){
        System.out.println("m1 method of ObjectEqualMethods");
    }
}
