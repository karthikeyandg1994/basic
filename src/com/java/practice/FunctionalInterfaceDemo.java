package com.java.practice;

import java.util.function.Function;

//FunctionalInterfaceImpl creation is avoided with lambda
class FunctionalInterfaceImpl implements Function<String,Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = (name) -> name.length();
        System.out.println(function.apply("Gugapriya Karthikeyan"));
    }
}
