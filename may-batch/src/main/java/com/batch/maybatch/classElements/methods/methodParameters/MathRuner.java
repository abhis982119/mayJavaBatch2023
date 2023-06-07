package com.batch.maybatch.classElements.methods.methodParameters;

public class MathRuner {

    public static void main(String[] args){
        Dog  xyz = new Dog();
        Dog  scooby = new Dog();
        Dog  tommy = new Dog();

        AnimalTrainer raghu = new AnimalTrainer();
        raghu.trainToSpeak(xyz);
        raghu.trainToSpeak(scooby);
        raghu.trainToSpeak(tommy);



        //System.out.println("sum is  : " + result);
    }

    /*
    1. PassbyValue
    2. PassByReference
     */
}


/*
---------         ---------            ------------
main               HEAP                     speak()
----------       ---------           -------------
String[] args
                    [12343212]
Dog xyz  ------->  Dog{name:Scooby}  <------ d
xyz.name = "Scooby"                    d.name = "tommy"
  xyz.bark()                             d.bark()
---------                            -------------
math.add()      -------------->
------------                         -----------
                <-------------      result = 30
----------                           ------------

math.speak()  ---------------->

----------                          --------------




 */