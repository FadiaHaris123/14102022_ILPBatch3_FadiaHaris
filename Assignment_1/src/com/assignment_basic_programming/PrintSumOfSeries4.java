package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSumOfSeries4 {

	public static void main(String[] args) {

//		6.Calculate the sum of the series 1/1! +2/2!+3/3!+.............+n! 
		System.out.println("Enter the limit of the series :- 1/1! +2/2!+3/3!+.............+n/n! ");
		Scanner scanner = new Scanner(System.in);
		int numberLimit = scanner.nextInt();
		double sum = 0;
		Factorial fact = new Factorial();
		for (int i = 1; i <= numberLimit; i++) {
//			System.out.println(fact.factorial(i));
			sum = sum + (double)i/fact.factorial(i);   //casting integer number to double
		}
		System.out.println("Sum of the series = " + sum);
	}

}
