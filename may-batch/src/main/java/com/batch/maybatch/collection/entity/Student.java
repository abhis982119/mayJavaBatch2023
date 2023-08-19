package com.batch.maybatch.collection.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public final class Student implements  Comparable<Student>{

    private String name;

    private int rollNumber;


    public void m1(){

    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

}

