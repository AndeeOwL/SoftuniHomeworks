package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			String[] carInput = input.split(" ");
			if (carInput.length == 3 ) {
				Car car = new Car(carInput[0], carInput[1], Integer.parseInt(carInput[2]));
				car.carInfo();
			} else {
				Car car = new Car(carInput[0]);
				car.carInfo();
			}

		}
    }
}
