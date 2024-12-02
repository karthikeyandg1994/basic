package com.java.jb.collections;

import java.util.ArrayList;

public class EqualityDemo {
    public static void main(String[] args) {
        Students student1 = new Students("Karthi" , "32", "CSE");
        Students student2 = new Students("Guga","24","CSE");
        Students student3 = new Students("Karthi", "32","CSE");

        System.out.println(student1 == student2);
        System.out.println(student1==student3);
        System.out.println(student1.equals(student3));

        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());

        ArrayList<Students> studentsList = new ArrayList<Students>();
        studentsList.add(student3);
        studentsList.add(student2);
        studentsList.add(student1);

        System.out.println(studentsList);

        studentsList.sort(new StudentsNameComparator());

        System.out.println(studentsList);
    }
}
