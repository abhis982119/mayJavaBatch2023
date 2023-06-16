package com.batch.maybatch.stringsInjava.mystring.animal;

import com.batch.maybatch.stringsInjava.mystring.animal.Dog;

public class UpcastAndDownCast {

    public static void main(String[] args) {
        int a = 10;
        Dog sheru = new Dog("SHERU","LOCAL");
        Dog goldy = new Dog("GOLDY","LABARADOR");

        Object obj1 = sheru;
        Dog downcastSheru = (Dog) obj1;



        System.out.println(checkIfBothAnimalIsSame(sheru, goldy));


        // Dog   --upcast->   Animal  -upcast-> Object
       // +bark()             +speak()             12 method of object
       // +maxAge            +minage
       // +name
        //+breed  <-downcast-   Animal  <--downcast -- Object
    }

    public static boolean checkIfBothAnimalIsSame(Object obj1, Object obj2){
         Dog dog1 = (Dog) obj1;
         Dog dog2 = (Dog) obj2;


        if(!dog1.breed.equals(dog2)){
            return false;
        }

         if(dog1.name.equals( dog2.name)){
             return false;
         }

       return true;
    }


    /*
    --------     -------------        -------------
    main-stack        heap              checkIfBothAnimalIsSame -stack
    --------     -------------         ------------
 Dog sheru   ---->  20 Sheru{}    <----    obj1  Object
 Dog goldy  ----->  32 Goldy{}    <----    obj2  Object










     */


}
