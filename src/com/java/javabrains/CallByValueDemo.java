package com.java.javabrains;

class Car {
    String name;
    String price;

    Car(String name, String price) {
        this.name = name;
        this.price=price;
    }

    public void change(Car car){
        car.name = "Baleno";
    }
}
public class CallByValueDemo {
    public static void main(String[] args) {
        Car car = new Car("3XO","100");
        System.out.println(car.name + " " + car.price);
        car.change(car);
        System.out.println(car.name + " " + car.price);
    }
}
