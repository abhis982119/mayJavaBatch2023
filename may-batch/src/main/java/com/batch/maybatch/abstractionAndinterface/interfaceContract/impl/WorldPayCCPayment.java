package com.batch.maybatch.abstractionAndinterface.interfaceContract.impl;

import com.batch.maybatch.abstractionAndinterface.interfaceContract.api.CCPayment;
import com.batch.maybatch.oops.polymorphism.overriding.payment.PaymentCC;

public class WorldPayCCPayment extends   CCPayment {




    @Override
    public void redirectToGatewayUrl() {
        System.out.println("redirect to  worldypay gateway site");
    }

    @Override
    public void acknowledgeGatewayResponse() {
        System.out.println("acknowledge  worldypay gateway response");
    }

}
