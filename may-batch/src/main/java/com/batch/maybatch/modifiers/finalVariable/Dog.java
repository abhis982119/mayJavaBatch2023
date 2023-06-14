package com.batch.maybatch.modifiers.finalVariable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public   class Dog {  // final class cannot be inherited

    private final String breed; // makes it constant


    private String color;



    private String name;

    public Dog(String breed, String color, String name) {
        this.breed = breed;
        this.color = color;
        this.name = name;
    }




    public final void bark(){      // method cannot be over-ridden
        System.out.println("bark");
    }




}
