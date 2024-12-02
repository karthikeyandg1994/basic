package com.java.jb.generics;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>();
        monkeyCage.setAnimal1(new Monkey());
        monkeyCage.setAnimal2(new Monkey());

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());

        //Cage<Integer> intCage = new Cage<>();
    }
}
