package com.ilpexeprion.basicprogramming;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		
		int number;
		//int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number - ");
		number=scanner.nextInt();
		if (number == 0)
		{
			System.out.println("Number is 0");
		}
		else if((number % 2) != 0)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even");
		}
		
		
		
		
	}

}
