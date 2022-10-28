package com.assignment_basic_programming;

import java.util.Scanner;

public class Arrange4NumbersinAscendingAndDescending {

	//2. Program to arrange four numbers in ascending and descending order 
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[4];
		int tempNumber;
		System.out.println("Enter four numbers - ");
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
		System.out.print("Numbers in ascending order :  ");
		for (int i = (numbers.length) - 1; i >= 0; i--)
			System.out.print(numbers[i] + " ");
		System.out.print("\nNumbers in descending order :  ");
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

	}
}
