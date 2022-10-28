package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSumOfSeries5 {

	public static void main(String[] args) {

//		7. Calculate the sum of the series 1/1!+2/4! +3/9!+............ 
		System.out.println("Enter the limit of the series :- 1/1! +2/4!+3/9!+........");
		Scanner scanner = new Scanner(System.in);
		int numberLimit = scanner.nextInt();
		double sum = 0;
		Factorial fact = new Factorial();
		for (int i = 1; i <= numberLimit; i++) {
//			System.out.println(fact.factorial(i));
			sum = sum + (double)i/fact.factorial(i*i);   //casting integer number to double
		}
		System.out.println("Sum of the series = " + sum);
	}

}
