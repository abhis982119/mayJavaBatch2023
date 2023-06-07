package com.batch.maybatch.classElements.methods.methodParameters;

public  class AnimalTrainer {



   public void trainToSpeak(Dog d) {
      d.bark();
   }











    /*
    ----           -------
    speak()          HEAP
    ----            -------
    d   ------->     Dog{bark()}
    ------




     */
}
