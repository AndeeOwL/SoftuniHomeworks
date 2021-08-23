package com.company;

import java.util.Scanner;

public class SumOfGreatestAndSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int biggest=0;
        int smallest=0;

        if (a >= b && a >= c) {
            biggest = a;
        } else if (b >= a && b >= c){
            biggest = b;
        } else if ( c >= a && c >= b) {
            biggest = c;
        }

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c){
            smallest = b;
        } else if ( c <= a && c <= b) {
            smallest = c;
        }
        System.out.println(smallest+biggest);
    }
}
