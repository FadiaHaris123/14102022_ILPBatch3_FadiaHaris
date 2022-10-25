package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSumOfSeries6 {

	public static void main(String[] args) {

//		Calculate the sum of the series 1/(1^1+1!)+2/(4^2+2!) +3/(9^3+3!)+............ 
		System.out.println("Enter the limit of the series :- 1/(1^1+1!)+2/(4^2+2!) +3/(9^3+3!)+............ ");
		Scanner scanner = new Scanner(System.in);
		int numberLimit = scanner.nextInt();
		double sum = 0;
		Factorial fact = new Factorial();
		for (int i = 1; i <= numberLimit; i++) {
//			System.out.println(fact.factorial(i));
//			System.out.println(Math.pow((i*i),i));
			sum = sum + (double)i/(Math.pow((i*i),i)+fact.factorial(i));
		}
		System.out.println("Sum of the series = " + sum);
	}

}
