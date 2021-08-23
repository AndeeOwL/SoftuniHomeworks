package com.company;

import java.util.Scanner;

public class CirclePerimeterArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r,2);
        System.out.printf("%.2f     %.2f",perimeter,area);
    }
}
