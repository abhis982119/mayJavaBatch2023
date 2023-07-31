package com.batch.maybatch.doubtSession.factory;

import com.batch.maybatch.doubtSession.entity.Pasta;
import com.batch.maybatch.oops.inheritance.animal.Cat;

public class FoodFactory {

      FoodFactory(){

    }
    public  Pasta getPastaInstance( ){
       return new Pasta();

    }
}
