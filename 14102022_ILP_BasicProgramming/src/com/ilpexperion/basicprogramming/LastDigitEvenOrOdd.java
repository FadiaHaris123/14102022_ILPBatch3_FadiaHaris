package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class LastDigitEvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		
		int inputNumber = scanner.nextInt();
		int lastDigit = inputNumber%10;
		if(lastDigit==0)
		{
			System.out.println("The number is zero");
		}
		else if(lastDigit%2==0)
		{
			System.out.println("The last digit is even");
		}
		else
			System.out.println("The last digit is odd");
	}

}
