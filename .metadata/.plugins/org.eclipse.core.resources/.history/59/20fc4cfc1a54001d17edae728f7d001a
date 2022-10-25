package com.assignment_basic_programming;

import java.util.Scanner;

public class SortInDescending {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[3];
		int tempNumber;
		System.out.println("Enter three numbers - ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = scanner.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					tempNumber = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tempNumber;
				}
			}
		}
		System.out.println("Numbers in descending order :  ");
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

	}
}