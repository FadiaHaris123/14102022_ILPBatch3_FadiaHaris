package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	Product product = new Product();
	
	public void inputProductDetails() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Proudct Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Valdity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();
		
		product.setProductCode(productCode);
		product.setProductName(productName);
		product.setProductDescription(productDescription);
		product.setProductPrice(productPrice);
		product.setOpenDate(openDate);
		product.setExpiryDate(expiryDate);
		product.setValidityDate(validityDate);

	}

	public void displayProductDetails() {

		System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price"
				+ "			" + "Open Date" + "		" + "Expiry Date");
		System.out.println(product.getProductName() + "				" + product.getProductDescription() + "				" + product.getProductPrice()
				+ "		" + product.getOpenDate() + "		" + product.getExpiryDate());

	}

	
	
	

}
