package com.batch.maybatch.generic.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicGenericRunner {

    public static void main(String[] args) {
        List<OrderItemDetails> list = getOrderList();
        List<Student> studentList = getStudentOrderList();

        PageUtil<Student> studentPageUtil = new PageUtil<>();
        Page<Student> studentPage = studentPageUtil.getPage(studentList,1);
        System.out.println(studentPage);


         PageUtil<OrderItemDetails> orderItemDetailsPageUtil = new PageUtil<>();
         Page<OrderItemDetails> orderItemDetailsPage = orderItemDetailsPageUtil.getPage(list, 1);
         System.out.println(orderItemDetailsPage);

    }

    private static List<OrderItemDetails> getOrderList() {
        OrderItemDetails  orderDetail1 = new OrderItemDetails(1);
        OrderItemDetails  orderDetail2 = new OrderItemDetails(2);
        OrderItemDetails  orderDetail3 = new OrderItemDetails(3);
        List<OrderItemDetails> list = new ArrayList<>();
        list.add(orderDetail1);
        list.add(orderDetail2);
        list.add(orderDetail3);
        return list;
    }

    private static List<Student> getStudentOrderList(){
        Student student1 = new Student(100);
        Student student2 = new Student(102);
        Student student3 = new Student(103);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }
}
