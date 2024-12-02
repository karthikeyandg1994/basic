package com.java.jb.collections;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            System.out.println("Enter " + (i+1) + " number");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int n:numbers){
            System.out.print(n + " ");
            sum += n;
        }

        System.out.println(sum);
    }
}
