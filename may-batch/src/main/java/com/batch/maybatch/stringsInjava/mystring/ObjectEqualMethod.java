package com.batch.maybatch.stringsInjava.mystring;

public class ObjectEqualMethod {

    public static void main(String[] args) {


       Student naresh = new Student(1, "Naresh", 4,"Hyderabad");
       Student ashish = new Student(2, "Ashish", 4, "Ghaziabad");
   //             20
       Student ashish2 = new Student(2, "Ashish", 4, "Ghaziabad");
//              24




        if(ashish2.equals(ashish)){
            System.out.println("   ashish1 &  ashish2 both students  same");
        }else{
            System.out.println(" ashish1 &  ashish2 both students are  not same");
        }


        if(ashish.equals(ashish2)){
            System.out.println("   ashish1 &  ashish2 both students  same");
        }else{
            System.out.println(" ashish1 &  ashish2 both students are  not same");
        }

        Object obj = ashish2;
        //   Object obj = new Student(2, "Ashish", 4, "Ghaziabad");


        /*
        public boolean equals(Object obj) {
            return (this == obj);  //reference comparison
        }

           public boolean equals(Student student) {

            return (this.rollno = student.rollno);
        }

 */



        if(naresh.equals(ashish)){
           System.out.println("both students not same");
       }else{
           System.out.println("both students are  not same");
       }





    }



    public void m1(){
        System.out.println("m1 method of ObjectEqualMethods");
    }
}
