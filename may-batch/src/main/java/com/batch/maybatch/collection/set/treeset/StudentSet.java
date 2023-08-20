package com.batch.maybatch.collection.set.treeset;

import java.util.Collections;
import java.util.TreeSet;

public class StudentSet {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<Student>();
        students.add(new Student(1,"Naresh"));
        students.add(new Student(2,"Pinky"));

        System.out.println(students);
    }
}
