package com.assignment_basic_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class SortNumbersinAscendingAndDescending {

	// 12.Program to sort an array in ascending and descending order. 
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		char choice;
		do {
			System.out.println("Enter the integer element into the array :");
			list.add(scanner.nextInt());
			System.out.println("Do you want to enter more elements(y/n):");
			choice = scanner.next().charAt(0);
		} while (choice == 'y');
		int tempNumber;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					tempNumber = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tempNumber);
				}
			}
		}

		System.out.print("Numbers in ascending order :  ");
		for (int i = list.size() - 1; i >= 0; i--)
			System.out.print(list.get(i) + " ");
		System.out.print("\nNumbers in descending order :  ");
		for (Integer number : list)
			System.out.print(number + " ");

	}
}
