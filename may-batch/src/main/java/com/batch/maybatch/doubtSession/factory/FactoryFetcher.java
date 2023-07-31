package com.batch.maybatch.doubtSession.factory;

import com.batch.maybatch.doubtSession.factory.AnimalFactory;
import com.batch.maybatch.doubtSession.factory.FoodFactory;
import com.batch.maybatch.oops.constructors.A;

public class FactoryFetcher {

    public static AnimalFactory getAnimalFactory(){
        return new AnimalFactory();
    }

    public static  FoodFactory getFoodFactory(){
        return new FoodFactory();
    }
}
