package com.java.practice;

interface Shape {
    /**
     * Shape is a functional interface.
     * Functional interface should have only one abstract method, and it can have any number of default/static methods.
     * draw method is public abstract and no need to mention it explicitly
     */
    void draw();
}

interface Addable {
    int add(int a, int b);
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {

        /*
            Lambda syntax () -> { ... }
            () will have parameters
            -> indicates lambda
            { ... } contains body of the method
         */


        Shape shape = () -> System.out.println("Rectangle is drawn");
        //Here lambda acts as method explanation and it won't be called

        shape.draw();

        Addable addition = (a,b) -> { return a+b; };
        //Addable addition = Integer::sum;

        System.out.println(addition.add(24,32));

        //Runnable is a functional interface, using lambda for run method explanation
        Runnable thread = () -> System.out.println("Creating thread using lambda");

        Thread threadLambda = new Thread(thread);
        threadLambda.start();
    }
}
