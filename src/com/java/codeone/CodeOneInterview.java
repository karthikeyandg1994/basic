package com.java.codeone;


import java.io.IOException;

class Example {
    public void add() {
        System.out.println("Add method without paramertes");
    }

    public void add(int a, int b) throws IOException {
        System.out.println(a+b);
    }

}
abstract class Vehicle {
    public abstract  void run();

    private void commonMethod() {
        System.out.println("This is a common method");
    }
}

class A {
    public void oneMethod() {
        System.out.println("I am from A");
    }
}

class B extends A {
    public void oneMethod() {
        System.out.println("I am from B");
    }
}
class Car extends Vehicle {
    public void run() {
        System.out.println("This is a car");
    }
}
public class CodeOneInterview {
    public static void main(String[] args) {
        Car car = new Car();

        int a=10, b=0;
        try {
            float c = a/b;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
