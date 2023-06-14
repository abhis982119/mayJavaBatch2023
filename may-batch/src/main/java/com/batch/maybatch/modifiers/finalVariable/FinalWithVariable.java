package com.batch.maybatch.modifiers.finalVariable;

import lombok.ToString;


@ToString
public class FinalWithVariable extends Object {

    private static int empId; ;

    {
        empId = 6789;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
}
