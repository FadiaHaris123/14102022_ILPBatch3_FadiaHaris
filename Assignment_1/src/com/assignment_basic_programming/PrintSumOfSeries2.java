package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSumOfSeries2 {

	public static void main(String[] args) {

//		4. Calculate the sum of the series 1^3+2^3+3^3+5^3+8^3+....................+n^3 
		System.out.println("Enter the limit of the series :- 1^3+2^3+3^3+5^3+8^3+....................+n^3 ");
		Scanner scanner = new Scanner(System.in);
		int numberLimit = scanner.nextInt();
		int firstNumber = 1;
		int secondNumber = 2;
		int sum = 0;
		sum = (int) (Math.pow(firstNumber, 3) + Math.pow(secondNumber, 3));
		int thirdNumber = firstNumber + secondNumber;
		for (int i = 2; i < numberLimit; i++) {
			sum += Math.pow(thirdNumber, 3);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		System.out.println("Sum of the series = " + sum);
	}

}
