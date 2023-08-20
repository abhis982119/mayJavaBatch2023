package com.batch.maybatch.collection.map.hashEqualsContract;

import com.batch.maybatch.collection.entity.ReportCard;
import com.batch.maybatch.collection.entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class HashEquals {

    public static void main(String[] args) {
        Student naresh = new Student("Naresh", 1);
        Student pinky = new Student("Pinky", 2);

        Student unknownStudent = new Student("Pinky", 2);

        ReportCard nareshReport = new ReportCard(50, 90, 89);
        ReportCard pinkyReport = new ReportCard(70, 100, 92);




        Map<Student, ReportCard> studentReportCard = new HashMap<>();
        studentReportCard.put(naresh,nareshReport);
        studentReportCard.put(pinky, pinkyReport);

        studentReportCard.put(unknownStudent, pinkyReport);

        studentReportCard.entrySet().forEach(System.out::println);



    }
}
