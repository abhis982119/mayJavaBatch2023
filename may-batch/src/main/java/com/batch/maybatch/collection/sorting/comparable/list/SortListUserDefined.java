package com.batch.maybatch.collection.sorting.comparable.list;

import com.batch.maybatch.collection.entity.Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortListUserDefined {


    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        Student naresh = new Student("Naresh", 1);
        Student mahikshit = new Student("Mahikshit", 2);
        Student pinky = new Student("Pinky", 3);

        students.add(naresh);
        students.add(mahikshit);
        students.add(pinky);



        System.out.println(students);

        Collections.sort(students);

        System.out.println("After sorting by name ");
        System.out.println(students);


    }
}
