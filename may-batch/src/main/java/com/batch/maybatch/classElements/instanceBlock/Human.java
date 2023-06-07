package com.batch.maybatch.classElements.instanceBlock;

public class Human {


    private String name;

    private String race;

    private int walkingSpeed;


    public Human(String name, String race, int walkingSpeed) {
        this.name = name;
        this.race = race;
        this.walkingSpeed = walkingSpeed;

    }


    public void travel(String  source ,  String destination , int totalDistance){
        int hourTookToTravel  = (totalDistance/walkingSpeed);
        System.out.println("Total time taken to travel from " + source +
                " to  " + destination + " is  :  " + hourTookToTravel+ " hours");
    }
}
