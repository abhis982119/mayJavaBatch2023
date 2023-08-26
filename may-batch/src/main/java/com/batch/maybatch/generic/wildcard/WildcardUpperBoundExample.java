package com.batch.maybatch.generic.wildcard;

 
import java.util.ArrayList;
        import java.util.List;

public class WildcardUpperBoundExample {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);

        System.out.println("Sum of integers: " + sumOfList(integers)); // Valid
        System.out.println("Sum of doubles: " + sumOfList(doubles));    // Valid
    }
}
