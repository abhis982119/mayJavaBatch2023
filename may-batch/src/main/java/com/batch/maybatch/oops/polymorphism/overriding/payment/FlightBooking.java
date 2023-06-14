package com.batch.maybatch.oops.polymorphism.overriding.payment;

public class FlightBooking {

    public static void main(String[] args) {

        PaymentCC cc = new PaymentCC();

        PaymentUPI upi = new PaymentUPI();

      //  PaymentProcessor.doPayment(cc);
        PaymentProcessor.doPayment(upi);
        PaymentProcessor.doPayment(cc);
    }
}
