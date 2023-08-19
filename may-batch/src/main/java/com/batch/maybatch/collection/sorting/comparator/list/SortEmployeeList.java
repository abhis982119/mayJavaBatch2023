package com.batch.maybatch.collection.sorting.comparator.list;

import com.batch.maybatch.collection.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeList {

    public static void main(String[] args) {
        List<Employee>  employees = new ArrayList<>();

        Employee naresh = new Employee("Naresh", 1);
        Employee raghav = new Employee("Raghav", 2);
        Employee pinky = new Employee("Pinky", 3);

        employees.add(naresh);
        employees.add(raghav);
        employees.add(pinky);

        System.out.println(employees);

        //sort employees by name
        System.out.println("sorted emp by name");
    //    Collections.sort(employees, new EmpNameComparator());
          employees.sort(new EmpNameComparator());  // legacy code
        System.out.println(employees);

        //sort employees by id - using lambda

        employees.sort( (emp1, emp2) -> {
                return  emp1.getEmpId()-emp2.getEmpId();
        });

        System.out.println("Employees sorted by id");
        System.out.println(employees);

    }
}
