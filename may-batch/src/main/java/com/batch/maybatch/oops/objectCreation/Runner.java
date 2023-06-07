package com.batch.maybatch.oops.objectCreation;

public class Runner {

    public static void main(String[] args) {
        Name name = new Name("Ashish", "Mohan", "Gautam");
        ContactDetails contactDetails = new ContactDetails("9654541712", "professionEmailId@gmail.com",
                "personalEmail@gmail.com", null);
        Employee employee = new Employee(name,contactDetails, null, null, null);
    }
}
