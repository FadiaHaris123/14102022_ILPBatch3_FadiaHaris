package com.assignment_basic_programming;

import java.util.Scanner;

//15. Find the duplicates and remove it from the array .eg Input:{1,2,1,3,3,5,6,7} Output{1,2,3,5,6,7} 

public class FindDuplicatesandRemove {

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
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
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

	}

}