package com.batch.maybatch.oops.inheritance.animal;

import lombok.ToString;

@ToString
public class Dog extends Mammal {

    public void  speak(){
        System.out.println("brak");
    }

    public void wagTail(){
        System.out.println("Dog wag tail");
    }
}
