package com.batch.maybatch.abstractionAndinterface.interfaceContract.impl;

import com.batch.maybatch.abstractionAndinterface.interfaceContract.api.CCPayment;
import com.batch.maybatch.oops.polymorphism.overriding.payment.PaymentCC;

public class WireCardCCPayment  extends CCPayment {


    @Override
    public void redirectToGatewayUrl() {

    }

    @Override
    public void acknowledgeGatewayResponse() {

    }
}
