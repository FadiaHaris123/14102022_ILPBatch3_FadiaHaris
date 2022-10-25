package com.ilpexeprion.basicprogramming;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		
		int number;
		//int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number - ");
		number=scanner.nextInt();
		if((number % 2) == 0)
		{
			System.out.println("Even");
		}
		System.out.println("Odd");
		
		
		
		
	}

}
