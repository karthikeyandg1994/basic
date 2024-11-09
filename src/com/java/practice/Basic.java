package com.java.practice;
class A {
    private int a;
    static int b;

    A(int a) {
        this.a = a;
    }
    public int square(){
        return a*a;
    }
}
public class Basic {
    public static void main(String args[]){
        System.out.println("Gugapriya Karthikeyan");

        A obj = new A(10);
        System.out.println(obj.square());

        int x = 10;
        System.out.println(x++ + x++ + ++x);
    }
}
