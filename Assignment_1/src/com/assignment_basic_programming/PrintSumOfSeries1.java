package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSumOfSeries1 {

	public static void main(String[] args) {

//		3. Calculate the sum of the series 1-3+5-7+.............+n 
		System.out.println("Enter the limit from the series :- 1-3+5-7+.............+n ");
		Scanner scanner = new Scanner(System.in);
		int numberLimit = scanner.nextInt();
		if(numberLimit%2 == 0) {
			System.out.println("Please enter valid limit!!!");
		}
		else {
			int sign = 1;
			int sum = 0;
			for (int i = 1; i <= numberLimit; i += 2) {
				sum = sum + i * sign;
				sign *= -1;

			}
			System.out.println("Sum of the series = " + sum);
		}
		
	}

}
