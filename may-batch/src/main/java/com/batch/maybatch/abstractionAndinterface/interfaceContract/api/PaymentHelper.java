package com.batch.maybatch.abstractionAndinterface.interfaceContract.api;

public class PaymentHelper {


    public void doPayment(IPayment payment, int amount){

        payment.doPayment();
        System.out.print("payment done of amount " + amount);
    }
}
