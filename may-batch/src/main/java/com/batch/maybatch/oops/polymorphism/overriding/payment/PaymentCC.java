package com.batch.maybatch.oops.polymorphism.overriding.payment;

public class PaymentCC extends  Payment {

    public void doPayment(){
        takeCCDetails();
        sendClientToGatewayUrl();
        receivedGatewayNotificationOfPayment();
    }

    private void takeCCDetails(){
        System.out.println("CC details taken");
    }

    private void sendClientToGatewayUrl(){
        System.out.println("client redirected to payment gateway url");
    }


    private void receivedGatewayNotificationOfPayment(){
        System.out.println("Payment done ");
    }


}
