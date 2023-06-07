package com.batch.maybatch.oops.inheritance.animal;

import com.batch.maybatch.oops.inheritance.animal.Animal;

public class AnimalTrainer {


    public void makeSpeak(Animal animal){
        animal.speak();
        animal.animalDance();
    }


    /*

    //Low-level design :

            -> PaymentCC
    Payment -> PaymentDC         --->
            -> InternetBanking
            -> UPI

     */
}
