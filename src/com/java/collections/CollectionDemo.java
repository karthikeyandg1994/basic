package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList();
        fruitCollection.add("Apple");
        fruitCollection.add("Banana");
        fruitCollection.add("CustardApple");

        System.out.println(fruitCollection);
        fruitCollection.remove("Banana");
        fruitCollection.remove("Test");

        System.out.println(fruitCollection);

        fruitCollection.forEach((fruit)->{
            System.out.println(fruit + " " + fruit.length());
        });

        fruitCollection.clear();
        System.out.println(fruitCollection);

        fruitCollection = new LinkedList<>();
        System.out.println(fruitCollection.isEmpty());
    }
}
