package com.experion.utility;

import java.util.Scanner;


import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char mainChoice;
		int index = 0;
		do
		{
			System.out.println("************SuperMarket**********");
			System.out.println("Enter 1 - Add Product");
			System.out.println("Enter 2 - Display Product");
			int userChoice = scanner.nextInt();
			switch(userChoice) {
			case 1: Service.inputProductDetails(index);  //directly used class name because its function is set to static
					index++;
					break;
			case 2: Service.displayProductDetails();
					break;
			default : System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue (y/n) :");
			mainChoice=scanner.next().charAt(0);
		}
		while(mainChoice == 'y');	
		
		

	}

}
