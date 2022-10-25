package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemoforeach {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String productNames[]=new String[5];
		System.out.println("Enter product name");
		for(int i=0;i<productNames.length;i++) 
			productNames[i]=scanner.nextLine();
		for(String productName: productNames) 
			System.out.println(productName);
	}

}
