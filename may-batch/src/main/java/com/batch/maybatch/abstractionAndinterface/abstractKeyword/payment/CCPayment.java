package com.batch.maybatch.abstractionAndinterface.abstractKeyword.payment;

public abstract  class CCPayment {


      private void takeCCDetails(){

    }

    private void redirectToGatewaySite(){
        System.out.println("take redirected to gateway site ");
    }
    abstract void acknowledgeGatewayResponse();
}
