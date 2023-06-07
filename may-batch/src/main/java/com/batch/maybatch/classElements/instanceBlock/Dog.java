package com.batch.maybatch.classElements.instanceBlock;

public class Dog  extends Object {

    private String name;

    private String breed;


    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String breed, String color){
        this.breed = breed;
        this.color = color;
    }


}
