package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of products");
		int numberOfProducts = scanner.nextInt();
		String productNames[]=new String[numberOfProducts];
		System.out.println("Enter "+numberOfProducts+" product name");
//		productNames[0]=scanner.nextLine();
//		productNames[1]=scanner.nextLine();
//		productNames[2]=scanner.nextLine();
//		productNames[3]=scanner.nextLine();
//		productNames[4]=scanner.nextLine();
//		System.out.println(productNames[0]);
//		System.out.println(productNames[1]);
//		System.out.println(productNames[2]);
//		System.out.println(productNames[3]);
//		System.out.println(productNames[4]);
		scanner.nextLine();	//Removing Buffer
		for(int i=0;i<productNames.length;i++) 
			productNames[i]=scanner.nextLine();
		for(int i=0;i<productNames.length;i++) 
			System.out.println(productNames[i]+"	"+productNames[i].length());
	}

}
