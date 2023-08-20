package com.batch.maybatch.collection.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public final class Student implements  Comparable<Student>{


    private String name;

    private int rollNumber;


    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public int hashCode(){
      return  rollNumber%8;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }
}

