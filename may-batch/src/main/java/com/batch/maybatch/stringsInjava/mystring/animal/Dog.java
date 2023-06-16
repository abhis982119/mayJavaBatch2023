package com.batch.maybatch.stringsInjava.mystring.animal;

import com.batch.maybatch.stringsInjava.mystring.animal.Animal;
import lombok.ToString;

@ToString
public class Dog extends Animal {

    final int maxAge = 20;

    String name;

    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("dog barking");
    }
}
