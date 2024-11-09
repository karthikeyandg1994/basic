package com.java.practice;
import java.util.Scanner;

class Programs {

    static int n1=0,n2=1,res=0;
    public void fibinocci(int x) {
        int var1 = 0;
        int var2 = 1;
        int[] result = new int[x];
        result[0] = var1;
        result[1] = var2;
        for(int i=2; i<x;i++){
            result[i] = var1 + var2;
            var1 = var2;
            var2 = result[i];
        }
        for (int i=0;i<x;i++){
            System.out.print(result[i] + "\t");
        }
        System.out.println();
    }

    public void fibiRecursion(int n) {
        if(n>0){
            res = n1+n2;
            System.out.print(res + "\t");
            n1=n2;
            n2=res;
            fibiRecursion(n-1);
        }
    }

    public void prime(int number){
        int flag=0;
        if(number==0 || number==1){
            System.out.println(number + " is prime");
        } else if(number==2) {
            System.out.println(number + " is prime");
        } else if(number%2==0) {
            System.out.println(number + " is not prime");
        } else {
            for(int i=3;i<Math.sqrt(number);i=i+2){
                if(number%i==0){
                    flag=1;
                    System.out.println(number + " is not prime");
                    break;
                }
            }
            if(flag==0){
                System.out.println(number + " is prime");
            }
        }
    }

    public void palindrome(int number)
    {
        int reverse = 0,temp,input;
        input = number;
        while(number>0){
            temp = number%10;
            reverse = reverse*10 + temp;
            number = number/10;
        }
        if(input == reverse){
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
    }

    public void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class JavaPrograms {
    public static void main(String[] args) {
        Programs programs = new Programs();
        programs.fibinocci(7);
        programs.fibiRecursion(5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        //int n = scanner.nextInt();
        programs.prime(71);
        programs.palindrome(12321);
        programs.print(5);

        System.out.println("Commiting to 11 Nov Branch");
    }


}
