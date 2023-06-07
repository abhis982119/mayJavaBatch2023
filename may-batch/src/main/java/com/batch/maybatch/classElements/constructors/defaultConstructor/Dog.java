package com.batch.maybatch.classElements.constructors.defaultConstructor;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

    private String color;
    private String breed ;

    private String name;

    private int  maxHeight ;




    public Dog(String breed, String color) {
        System.out.println("color constructor called ");
        this.breed = breed;
        this.color = color;
    }




    public Dog(String breed, int maxHeight ){
        System.out.println("maxHeight int constructor called ");
        this.breed = breed;
        this.maxHeight = maxHeight;
    }

    public Dog(String breed, short maxHeight ){
        System.out.println("maxHeight short  constructor called ");
        this.breed = breed;
        this.maxHeight = maxHeight;
    }






    public Dog(String breed, String color, String name){
        this.breed = breed;
        this.color = color;
        this.name = name;
    }


}
