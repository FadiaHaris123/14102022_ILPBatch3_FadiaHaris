package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNumbersWithoutTemporaryVariable {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");
		firstNumber = scanner.nextInt();

		System.out.println("Enter second number:");
		secondNumber = scanner.nextInt();

		System.out.println("Numbers before swapping Number1 : " + firstNumber + " and Number2: " + secondNumber);

		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("Numbers after swapping Number1 : " + firstNumber + " and Number2: " + secondNumber);

	}

}
