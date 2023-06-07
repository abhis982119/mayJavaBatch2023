package com.batch.maybatch.oops.inheritance.banking;

public class InternetBanking extends Payment {

    @Override
    public void doPayment(){
        System.out.println("redirect user to banking site");
        System.out.println(" get payment acknowledge from bank");
    }

    @Override
    public void takeUserDetails(){
        System.out.println("take username & password");
    }
}
