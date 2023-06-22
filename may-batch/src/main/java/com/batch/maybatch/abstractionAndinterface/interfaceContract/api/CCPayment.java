package com.batch.maybatch.abstractionAndinterface.interfaceContract.api;

import com.batch.maybatch.abstractionAndinterface.interfaceContract.api.IPayment;

public abstract class CCPayment  implements IPayment  {


    @Override
    public final void doPayment() {
        fetchCCDetails();
        redirectToGatewayUrl();
        acknowledgeGatewayResponse();
    }


    public void fetchCCDetails(){
        System.out.println("fetch cc details");
        System.out.print("Validate credit card");
        System.out.print("Saved cc details after masking in database");
        System.out.print("fetching and saving ccdetails done");

    }
    public abstract void redirectToGatewayUrl();
    public abstract  void acknowledgeGatewayResponse();
}


/*
     public class A extends B  implements IA, IB, IC ....IN


 */