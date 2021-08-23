package com.company;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double result = Math.pow(b,2) - (4*a*c);
        double x1 = (-b - Math.sqrt(result)) / (2*a);
        double x2 = (-b + Math.sqrt(result)) / (2*a);

        System.out.println(x1);
        System.out.println(x2);

    }
}
