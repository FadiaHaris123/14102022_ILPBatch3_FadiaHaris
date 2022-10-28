package com.assignment_basic_programming;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// 17. Program to count the number of words in a given string sentence

		Scanner in = new Scanner(System.in);
		String str;
		int count = 0;
		System.out.print("Enter a String/Sentence: ");
		str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ')
				count++;
		}

		count = count + 1;

		System.out.println("Number of words: " + count);
	}

}
