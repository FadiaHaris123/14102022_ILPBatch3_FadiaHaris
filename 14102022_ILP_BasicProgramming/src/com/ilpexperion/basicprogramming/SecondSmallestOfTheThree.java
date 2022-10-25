package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondSmallestOfTheThree {

	public static void main(String[] args) {

		System.out.println("Enter a 3 numbers:");
		Scanner scanner = new Scanner(System.in);

		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int thirdNumber = scanner.nextInt();

		if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
			if (secondNumber > thirdNumber)
				System.out.println(secondNumber + " is the second smallest number");

			else
				System.out.println(thirdNumber + " is the second smallest number");
		} else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
			if (firstNumber > thirdNumber)
				System.out.println(firstNumber + " is the second smallest number");

			else
				System.out.println(thirdNumber + " is the second smallest number");
		} else if (secondNumber < thirdNumber) {

			System.out.println(secondNumber + " is the second smallest number");
		}
	}
}
