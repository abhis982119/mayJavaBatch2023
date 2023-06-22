package com.batch.maybatch.abstractionAndinterface.interfaceContract.api;

/*
                     concrete method                abstract method            object creation

   interface         not allowed : before 1.8          allowed                     not allowed
                     allowed after 1.8 only default

   abstract class      allowed                          allowed                    not allowed

   concrete class      allowed                         not allowed                   allowed

 */
public interface IPayment {

    void doPayment();



}






/*
  client              business

   impl         |    api-contract
                |    call-sequencing
                |    logging


 */