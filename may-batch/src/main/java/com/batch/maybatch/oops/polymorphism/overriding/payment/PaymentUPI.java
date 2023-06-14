package com.batch.maybatch.oops.polymorphism.overriding.payment;

public class PaymentUPI extends  Payment{

    @Override
    public void doPayment(){
         enterUPIDetails();
         enterUPIPIN();
         receivedAckFromBank();
    }

    public void enterUPIDetails(){
        System.out.println("Entered upi details");
    }

    public void enterUPIPIN(){
        System.out.println("Entered upi pin");
    }

    public void receivedAckFromBank(){
        System.out.println("Payment done");
    }
}
