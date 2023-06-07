package com.batch.maybatch.classElements.staticBlock;

public class Dog {

      static {
        breed = "labrador";
    }

    private String name;

    private static String breed;


    private String color;

    private static int maxHeight ;

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
