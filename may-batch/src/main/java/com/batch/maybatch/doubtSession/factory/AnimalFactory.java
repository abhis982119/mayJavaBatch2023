package com.batch.maybatch.doubtSession.factory;

import com.batch.maybatch.doubtSession.entity.Turtle;
import com.batch.maybatch.oops.inheritance.animal.Animal;
import com.batch.maybatch.oops.inheritance.animal.Cat;

public class AnimalFactory {
       AnimalFactory() {
     }

     public Turtle getTurtleInstance( ){
          return  new Turtle();
     }


}
