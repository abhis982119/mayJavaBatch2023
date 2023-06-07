package com.batch.maybatch.classElements.instanceBlock;

public class Labrador {



    static {
        breed = "labrador";  //x byte
        maxHeight = 1;       // 4 byte
    }


    private String name;

    private static  String breed = "labrador" ;


    private String color;

    private static int maxHeight ;




  public void bark(){
      System.out.println("bark");
  }



}
