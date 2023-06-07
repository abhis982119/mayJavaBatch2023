package com.batch.maybatch.classElements.constructors.defaultConstructor;

public class Runner {

    public static void main(String[] args){

        Dog dog = new Dog("breed", "color", "name", 4);


        Dog doberman = new Dog("doberman", "brown");
        Dog huskey = new Dog("huskey","grey");

        Dog labrador = new Dog("labrador", "golden", "Goldy");

        Dog bhutia = new Dog("bhutia",(short)4);


        System.out.println("dog breed : " + doberman.getBreed()  +  " with color : "  + doberman.getColor() + " and name : " + doberman.getName() + " max achievable height " +  doberman.getMaxHeight());
        System.out.println("dog breed : " + huskey.getBreed() +  " with color : "  + huskey.getColor() +  " and name : " + huskey.getName()  + " max achievable height " +  huskey.getMaxHeight());
        System.out.println("dog breed : " + labrador.getBreed() +  " with color : "  + labrador.getColor() +  " and name : " + labrador.getName() + " max achievable height " +  labrador.getMaxHeight());
        System.out.println("dog breed : " + bhutia.getBreed() +  " with color : "  + bhutia.getColor() +  " and name : " + bhutia.getName() + " max achievable height " +  bhutia.getMaxHeight());



    }
}
