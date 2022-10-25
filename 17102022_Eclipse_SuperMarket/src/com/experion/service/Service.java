package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	static Product productList[] = new Product[1]; // made into static because static function can take only static
													// variables but not a good method
	int userInput;
	int noOfProducts = 0;

	public static void inputProductDetails(int index) {

		Scanner scanner = new Scanner(System.in);

		scanner.nextLine();
		System.out.println("Enter Product Code - ");
		String productCode = scanner.nextLine();

		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();

		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();

		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();

		System.out.println("Enter Open Date - ");
		String openDate = scanner.nextLine();

		scanner.nextLine();
		System.out.println("Enter Validity Date - ");
		String validityDate = scanner.nextLine();

		System.out.println("Enter Expiry Date - ");
		String expiryDate = scanner.nextLine();

		System.out.println("Enter whether product is active - ");
		boolean active = scanner.nextBoolean();

		productList[index] = new Product(productCode, productName, productDescription, productPrice, openDate,
				validityDate, expiryDate, active);

	}

	public static void displayProductDetails() {
		for (int i = 0; i < productList.length; i++) {
			System.out.println("The product code is " + productList[i].getProductCode());
			System.out.println("The product name is " + productList[i].getProductName());
			System.out.println("The product description is " + productList[i].getProductDescription());
			System.out.println("The product price is " + productList[i].getProductPrice());
			System.out.println("The product open date is " + productList[i].getOpenDate());
			System.out.println("The product validity date is " + productList[i].getValidityDate());
			System.out.println("The product expiry date is " + productList[i].getExpiryDate());
			System.out.println("The product is active - " + productList[i].isActive());
		}

	}
}
