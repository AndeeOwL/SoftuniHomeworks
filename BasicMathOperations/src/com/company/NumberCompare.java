package com.company;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(Math.max(a,b));
    }
}
