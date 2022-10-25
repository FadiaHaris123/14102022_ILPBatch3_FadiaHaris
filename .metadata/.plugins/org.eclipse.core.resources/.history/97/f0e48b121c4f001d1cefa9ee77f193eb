package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {

		char mainChoice;
		char customerChoice;
		int serialNumber;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Product> productList = new ArrayList<Product>();

		System.out.println("************Welcome**********");
		do {
			System.out.println("1.Add Product 2.Display Product 3.Purchase Product ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				try {
					productList.add(Service.createProduct());
				} catch (ParseException e) {

					e.printStackTrace();
				}
				break;
			case 2:
				if (productList.isEmpty()) {
					System.out.println("No Available Product to Display");
				} else {
					Service.displayProductDetails(productList);
				
				}
				break;
			case 3:
				if (productList.isEmpty()) {
					System.out.println("No Available Product to Purchase");
				} else {
					System.out.println("Available Products");

					Service.displayProductDetails(productList);
					System.out.println("Do you wish to purchase: y/n ");
					customerChoice = scanner.next().charAt(0);
					while (customerChoice == 'y') {
						System.out.println("Enter Serial Number of the product you wish to Purchase");
						serialNumber = scanner.nextInt();
						Service.displayValidProducts(productList, serialNumber);
						System.out.println("Do you wish to Purchase other product : y/n ");
						customerChoice = scanner.next().charAt(0);
					}

					//System.out.println("Thank you visit again");
				
				}
				break;

			}

			System.out.println("Do you want to continue: y/n ");
			mainChoice = scanner.next().charAt(0);
		} while (mainChoice == 'y');

//		System.out.println("Do you wish to purchase: y/n ");
//		customerChoice = scanner.next().charAt(0);
//		while (customerChoice == 'y') {
//
//			System.out.println("Enter Serial Number");
//			serialNumber = scanner.nextInt();
//			Service.displayValidProducts(productList, serialNumber);
//
//			System.out.println("Do you wish to purchase: y/n ");
//			customerChoice = scanner.next().charAt(0);
//		}
		System.out.println("Thank you visit again");
	}

}
