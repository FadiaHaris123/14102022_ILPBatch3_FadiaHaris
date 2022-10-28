package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSumOfSeries3 {

	public static void main(String[] args) {

//		5. Calculate the sum of the series 1^1-3^2+5^3-7^4+.............+n^k
		System.out.println("Enter the limit of the series :- 1^1-3^2+5^3-7^4+.............+n^k ");
		Scanner scanner = new Scanner(System.in);
		int numberLimit = scanner.nextInt();
		int sign = 1;
		int sum = 0;
		int powers = 1;
		for (int i = 1; i <= numberLimit; i += 2) {
			sum = (int) (sum + Math.pow(i, powers) * sign);
			sign *= -1;
			powers++;

		}
		System.out.println("Sum of the series = " + sum);
	}

}
