package com.batch.maybatch.streamModification;

import com.batch.maybatch.collection.entity.Student;

import java.util.Arrays;
import java.util.List;

public class FindAverageMarks {

    public static void main(String[] args) {
        Student naresh = new Student("Naresh", 1, 400);
        Student pinky = new Student("Pinky", 2, 300);
        Student rajesh = new Student("rajesh", 3, 100);
        Student ramesh = new Student("ramesh", 4, 300);
        Student rahul = new Student("rahul", 5, 200);

        List<Student>  list = Arrays.asList(naresh, pinky, rajesh, ramesh, rahul);

        int maxMarks = 0;



        Student dummy = new Student();
       Student maxMarkStudent = list.stream()
                .reduce(dummy, (a,b) -> a.getMarks() > b.getMarks() ? a :b);


        System.out.println("Max mark student : " + maxMarkStudent);

       maxMarks =  list.stream()
                .map(student -> student.getMarks())
                .reduce(0, Math::max);

        System.out.println("Max marks : " + maxMarks);






    }
}
