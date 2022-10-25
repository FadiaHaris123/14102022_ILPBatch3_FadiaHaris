package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		int tempVariable;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");
		firstNumber = scanner.nextInt();

		System.out.println("Enter second number:");
		secondNumber = scanner.nextInt();
		
		System.out.println("Numbers before swapping Number1 : "+firstNumber+" and Number2: "+secondNumber);
		
		tempVariable = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempVariable;
		
		System.out.println("Numbers after swapping Number1 : "+firstNumber+" and Number2: "+secondNumber);
	}

}
