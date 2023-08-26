package com.batch.maybatch.generic.userDefinedGenericDataType;

import com.batch.maybatch.generic.basic.Student;

import java.util.ArrayList;
import java.util.List;

public class BoxRunner {

    public static void main(String[] args) {
        System.out.println("List Data");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);

        System.out.println("Integer - Box data");
        Box<Integer> box = new Box<>();
        box.add(1);



        System.out.println(box);


        System.out.println("String - Box data");
        Box<String> stringBox = new Box<>();
        stringBox.add("India");

        System.out.println(stringBox);




        System.out.println("Student - Box data");
        Box<Student> studentBox = new Box<>();
        studentBox.add(new Student(1));

        System.out.println(studentBox);
    }
}
