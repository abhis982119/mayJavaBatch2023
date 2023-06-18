package com.batch.maybatch.stringsInjava.mystring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

@Getter
@ToString
public class Student extends  Object{

    private int rollNo ;
    private String name;

    private int standard ;

    private String address;


    public Student(int rollNo, String name, int standard, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
        this.address = address;

    }

    @Override
    public boolean equals(Object obj) {
        //Student --upcast --> Obj
       // +addressequals
        //+name
        // Student  <--downcast--Object
        Student anotherStudent = (Student) obj;


        if(this.rollNo != anotherStudent.getRollNo()){
            return false;
        }



     return true;

    }



}
