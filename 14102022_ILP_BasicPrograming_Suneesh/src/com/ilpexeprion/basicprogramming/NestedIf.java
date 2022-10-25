package com.ilpexeprion.basicprogramming;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;
		int thridNumber;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first  number - ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second  number - ");
		secondNumber = scanner.nextInt();
		System.out.println("Enter third  number - ");
		thridNumber = scanner.nextInt();
		if ((firstNumber > secondNumber) && (firstNumber > thridNumber))
		
			System.out.println(firstNumber + "is greatest");
		
		else if(secondNumber > thridNumber)
		{
			System.out.println(secondNumber + "is greatest");
		}
		else
		{
			System.out.println(thridNumber + "is greatest");
		}
			
			

	}

}
