package com.batch.maybatch.generic.wildcard;


import com.batch.maybatch.oops.constructors.A;

import java.util.ArrayList;
        import java.util.List;

public class WildcardLowerBoundExample {
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        addIntegers(integers); // Valid
        addIntegers(numbers);  // Valid
        addIntegers(objects);  // Valid
     //   addIntegers(strings);

        System.out.println("Integers: " + integers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Objects: " + objects);
    }
}
