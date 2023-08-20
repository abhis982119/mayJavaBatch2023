package com.batch.maybatch.collection.set.treeset;

import com.batch.maybatch.collection.entity.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentCompare<T> {

    public static void main(String[] args) {
   /*     Student naresh = new Student(1, "Naresh");
        Student pinky = new Student(2, "Pinky");

        ArrayList<Student> students = new ArrayList<Student>(2);
        students.add(pinky);
        students.add(naresh);

        System.out.println("Before sort ");
        print(students);

        sort(students);

        System.out.println("After sort ");
        print(students);*/

    }

    // [pinky , naresh ]
    public static  <T extends Comparable<? super T>> void sort(List<T> t){
        for(int i = 1; i < t.size(); i++){
            T obj1 = t.get(i-1);
            T obj2 = t.get(i);

            if(obj1.compareTo(obj2) > 0 ){
                T temp = t.get(i);
                t.remove(temp);
                t.add(i-1, temp);
            }
        }
    }

    public static void print (ArrayList<Student> students ){
        students.forEach(System.out::println);

    }
}
