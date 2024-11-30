package com.java.codeone;

public class CodingExample {
    public static void main(String[] args) {
        int days[] = {1,2,4,6,17,25};
        int amount[] = {2,7,25};
        int total = 0;

        for (int i=0; i<days.length;i++){
            int temp = days[i];
            if(temp<7) {
                total = total + (temp*amount[0]);
            } else if (temp<30) {
                int n1 = temp/7;
                int n2 = temp%7;
                int subtotal = (n1*7) + (n2*2);
                System.out.println(subtotal);
                total += subtotal;
            } else if (temp>30){
                int m1 = temp/30;
                int m2 = temp%30;
                int m3 = m2/7;
                int m4 = m2%7;
                int subTotal = (m1*25) + (m3*7) + (m4*2);
                total += subTotal;
            }
        }

        System.out.println("Minimum amount required : " + total);
    }
}
