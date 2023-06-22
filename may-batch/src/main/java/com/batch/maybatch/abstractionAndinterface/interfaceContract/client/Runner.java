package com.batch.maybatch.abstractionAndinterface.interfaceContract.client;

import com.batch.maybatch.abstractionAndinterface.interfaceContract.api.PaymentHelper;
import com.batch.maybatch.abstractionAndinterface.interfaceContract.impl.WorldPayCCPayment;
import org.springframework.context.PayloadApplicationEvent;

public class Runner {

    public static void main(String[] args) {
        PaymentHelper paymentHelper = new PaymentHelper();

        WorldPayCCPayment worldPayCCPayment = new WorldPayCCPayment();

        paymentHelper.doPayment(  worldPayCCPayment,100);
    }
}
