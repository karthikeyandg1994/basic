package com.java.collections;

import java.util.*;
public class NeedForCollections {
    public static void main (String args[]) {
        System.out.println("Hello");

        int[] marks = new int[5];
        System.out.println(marks.length);

        //sorting an array
        int[] ar = new int[]{5,2,8,6,9};

        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++) {
                if(ar[i]>ar[j]){
                    int temp = ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }

        for (int p:ar){
            System.out.println(p);
        }
    }
}
