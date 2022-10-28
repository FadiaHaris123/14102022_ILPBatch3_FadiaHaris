package com.assignment_basic_programming;

import java.util.Arrays;
import java.util.Scanner;

//13. Program to count the occurrence of all numbers in an array

public class CountOccuranceofAllNumbers {
	Scanner scanner = new Scanner(System.in);

	public static void countFreq(int arr[], int n) {
		boolean visited[] = new boolean[n];

		Arrays.fill(visited, false);

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {

			// Skip this element if already processed
			if (visited[i] == true)
				continue;

			// Count frequency
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array:\n");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers:\n");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int noofOccurrence = arr.length;
		countFreq(arr, noofOccurrence);

	}

}