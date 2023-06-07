package com.batch.maybatch.oops.objectCreation;

import lombok.AllArgsConstructor;
import lombok.Setter;




public class Employee {


  private Name name;
  private ContactDetails contactDetails;
  private Department department;
  private Address address;


  public void setName(Name name) {
    this.name = name;
  }

  public Employee(Name name, ContactDetails contactDetails, Department department, Address address, String emailId) {
    this.name = name;
    this.contactDetails = contactDetails;
    this.department = department;
    this.address = address;
  }


}
