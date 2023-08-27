package com.batch.maybatch.streamsOperations;

import com.batch.maybatch.collection.entity.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudents {

    public static void main(String[] args) {
        Student naresh = new Student("Naresh" , 1);
        Student pinky = new Student("Pinky" , 2);

        List<Student> students = Arrays.asList(naresh,pinky);


        students.stream()
                .sorted(Comparator.comparing(student -> student.getRollNumber()))
                .collect(Collectors.toList());


        //using java 8 compatible features

        students.stream()
                .sorted(Comparator.comparing(Student::getRollNumber).reversed())
                .collect(Collectors.toList());

    }

}
