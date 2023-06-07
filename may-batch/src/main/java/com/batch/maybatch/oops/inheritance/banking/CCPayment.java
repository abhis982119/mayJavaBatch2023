package com.batch.maybatch.oops.inheritance.banking;

public class CCPayment extends Payment {
    @Override
    public void doPayment(){
        System.out.println("send cc details to gateway");
        System.out.println("collect  money ");
    }

    @Override
    public void takeUserDetails(){
        System.out.println("take cc details");
    }


}
