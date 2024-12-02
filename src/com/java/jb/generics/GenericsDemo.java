package com.java.jb.generics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsDemo {
    public static void main(String[] args) {
        //ArrayList names = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Karthi");
        names.add("Guga");
        //names.add(new Date());

        String myString = names.get(0);
        System.out.println(myString);
    }
}
