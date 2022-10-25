package com.assignment_basic_programming;

public class Factorial {

	public int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	
	}
}
