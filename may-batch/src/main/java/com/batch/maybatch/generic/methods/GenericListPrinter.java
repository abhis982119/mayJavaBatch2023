package com.batch.maybatch.generic.methods;

import com.batch.maybatch.generic.basic.Student;

import java.util.*;

public class GenericListPrinter {

    public static void main(String[] args) {
        List<Integer>  integerList = Arrays.asList(1,2,3,4,5);
        List<Character> characterList = Arrays.asList('a','b','c','d','e');
        List<Student> studentList = Arrays.asList(new Student(1), new Student(2));


        Set<Student> studentSet = new HashSet<>(studentList);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);

   /*     print(integerList);
        print(characterList);
        print(studentList);

        print(studentSet);*/

        Set<Integer> integerSet = new HashSet<>(integerList);

        printNumber(integerList);
        printNumber(integerSet);





    }






    public static void print(Collection<?> list){
        for(Object value : list){
            System.out.print(value + ", ");
        }
        System.out.println();;
    }



    Map<Integer, List< List<List<String>>>> list = new HashMap<>();



    public static <E extends Number>  void printNumber(Collection<E> c){
        for(E t : c ){
            System.out.print(t + ", ");
        }
        System.out.println();
    }




}
