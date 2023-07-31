package com.batch.maybatch.doubtSession;

import com.batch.maybatch.doubtSession.entity.Pasta;
import com.batch.maybatch.doubtSession.factory.FactoryFetcher;
import com.batch.maybatch.doubtSession.factory.FoodFactory;

public class Runner {

    public static void main(String[] args) {
                   // AbstractFactory
        Pasta pasta = FactoryFetcher.getFoodFactory().getPastaInstance();
        System.out.println(pasta);
    }
}
