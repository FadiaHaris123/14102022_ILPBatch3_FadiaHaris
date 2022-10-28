package com.assignment_basic_programming;

import java.util.Arrays;

import java.util.Scanner;

public class SumUptoEight {
	
	//14. Program to find the numbers that add up to a sum of 8 in an array. 

	public static void main(String[] args) {

		System.out

				.println("\n***** PROGRAM TO FIND A PAIR OF NUMBERS THAT ADD UPTO A SUM OF 8 IN AN ARRAY:******* \n\n");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array");

		int rangeVariable = scanner.nextInt();

		int numbers[] = new int[rangeVariable];

		System.out.println("Enter the array elements numbers");

		for (int index = 0; index < numbers.length; index++) {

			numbers[index] = scanner.nextInt();

		}

		int sumTracker = 0;

		for (int index = 0; index < numbers.length; index++) {

			for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {

				if (numbers[index] + numbers[innerIndex] == 8) {

					sumTracker++;

					System.out.println("The array elements that add upto 8 are: " + numbers[index] + " and "

							+ numbers[innerIndex] + " at" + index + " and " + innerIndex);

					break;

				}

			}

		}

		if (sumTracker == 0)

			System.out.print("No array elements add upto 8");

// TODO Auto-generated method stub

	}

}