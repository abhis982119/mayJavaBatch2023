package com.batch.maybatch.oops.inheritance.animal;

import lombok.ToString;

@ToString
public class Cat extends Mammal {

    public void  speak(){
        System.out.println("meow");
    }

    public void purring(){
        System.out.println("cat purring ");
    }
}
