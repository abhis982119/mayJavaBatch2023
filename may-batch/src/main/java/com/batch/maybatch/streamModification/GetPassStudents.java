package com.batch.maybatch.streamModification;

import com.batch.maybatch.collection.entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetPassStudents {


    public static void main(String[] args) {

        Student naresh = new Student("Naresh", 1, 400);
        Student pinky = new Student("Pinky", 2, 300);
        Student rajesh = new Student("rajesh", 3, 100);
        Student ramesh = new Student("ramesh", 4, 300);
        Student rahul = new Student("rahul", 5, 200);

        List<Student> list = Arrays.asList(naresh, pinky, rajesh, ramesh, rahul);

       Stream<Student> ns =  list.stream()
                .filter(student -> student.getMarks() > 250);

       ns.forEach(System.out::println);

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        System.out.println("original : " + list);


        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");



        list.stream()
                .filter(student -> student.getMarks() > 250)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }



}
