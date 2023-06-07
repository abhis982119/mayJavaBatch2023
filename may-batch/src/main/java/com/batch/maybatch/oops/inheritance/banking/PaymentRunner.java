package com.batch.maybatch.oops.inheritance.banking;

public class PaymentRunner {


    public static void main(String[] args) {
        CCPayment ccPayment = new CCPayment();

        InternetBanking internetBanking = new InternetBanking();

        TakePayment takePayment = new TakePayment();
       // takePayment.doPayment(ccPayment);
        takePayment.doPayment(internetBanking);
    }
}
