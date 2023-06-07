package com.batch.maybatch.oops.inheritance.animal;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal dog = new Dog();

        Animal cat = new Cat();


        AnimalTrainer trainer = new AnimalTrainer();
        trainer.makeSpeak(dog);
        trainer.makeSpeak(cat);

        
        





    }
}
