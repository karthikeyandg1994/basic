package com.java.jb.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(100.0);
        doubles.add(20.0);
        System.out.println(doubles);

        printNumbers(numbers);
        printNumbers(doubles);
    }

    private static void printNumbers (List<? extends Number> numbers) {
        Number number = numbers.get(0);
        System.out.println(number);
    }
}
