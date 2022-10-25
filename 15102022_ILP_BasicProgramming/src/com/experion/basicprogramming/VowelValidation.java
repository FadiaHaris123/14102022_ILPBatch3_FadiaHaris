package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {

		char userInputCharacter;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		userInputCharacter = scanner.next().charAt(0);

		switch (Character.toLowerCase(userInputCharacter)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(userInputCharacter + " is vowel");
			break;
		default:
			System.out.println(userInputCharacter + " is not a vowel");
		}
	}

}
