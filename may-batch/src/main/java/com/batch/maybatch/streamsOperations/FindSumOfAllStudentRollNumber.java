package com.batch.maybatch.streamsOperations;

import com.batch.maybatch.collection.entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSumOfAllStudentRollNumber {

    public static void main(String[] args) {
        Student naresh = new Student("Naresh" , 1);
        Student pinky = new Student("Pinky" , 2);

        List<Student> students = Arrays.asList(naresh,pinky);

       int sumOfRollNumber =  students.stream()
                .map(student -> student.getRollNumber())
                .reduce(0, (a,b) -> a+b);


       //converting above code into more 8 function

          sumOfRollNumber =  students.stream()
                .map( Student::getRollNumber)
                .reduce(0,  Integer::sum);

    }
}
