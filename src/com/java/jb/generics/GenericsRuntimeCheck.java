package com.java.jb.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karthi");
        names.add("Guga");

        addNewName(names, "Aadvik");
        System.out.println(names);

        wrongAddNewName(names, 200);
        System.out.println(names);

        String str = names.get(3);
    }

    private static void addNewName(List<String> names, String s) {
        names.add(s);
    }

    //Always use Generics while working with Collections
    private static void wrongAddNewName(List names, Integer i){
        names.add(i);
    }
}
