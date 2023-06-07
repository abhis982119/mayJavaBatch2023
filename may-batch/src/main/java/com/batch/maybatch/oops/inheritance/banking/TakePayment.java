package com.batch.maybatch.oops.inheritance.banking;

import com.batch.maybatch.oops.inheritance.banking.Payment;

public class TakePayment {

    public  void doPayment(Payment payment){
        payment.takeUserDetails();
        payment.doPayment();
    }


}
