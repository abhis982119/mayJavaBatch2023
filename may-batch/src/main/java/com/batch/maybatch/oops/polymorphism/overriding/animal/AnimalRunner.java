package com.batch.maybatch.oops.polymorphism.overriding.animal;

public class AnimalRunner {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Monkey monkey = new Monkey();
        Animal tiger = new Tiger();
        tiger.speak();


        DomesticAnimalTrainer trainer = new DomesticAnimalTrainer();

       trainer.makeAnimalSpeak(dog);
       trainer.makeAnimalSpeak(cat);



    }
}
