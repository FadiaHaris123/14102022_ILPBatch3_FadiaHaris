package com.assignment_basic_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class CountFrequencyofElement {

	// Program to count the frequency of an element of an array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		char choice;
		do {
			System.out.println("Enter the integer element into the array :");
			list.add(scanner.nextInt());
			System.out.println("Do you want to enter more elements(y/n):");
			choice = scanner.next().charAt(0);
		} while (choice == 'y');
		System.out.println("Enter the number of which you need to find the frequency - ");
		int element = scanner.nextInt();
		int count = 0;
		for (Integer num : list)
			if (num == element)
				count++;
		System.out.print("Frequency of the element " + element + " in the array is " + count);

	}

}
