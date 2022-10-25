package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	Product product = null;

	public void inputProductDetails() {
		try (Scanner scanner = new Scanner(System.in)) {
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
			
			product = new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
			
//			product.setProductCode(productCode);
//			product.setProductName(productName);
//			product.setProductDescription(productDescription);
//			product.setProductPrice(productPrice);
//			product.setOpenDate(openDate);
//			product.setValidityDate(validityDate);
//			product.setExpiryDate(expiryDate);
//			product.setActive(active);
//			
		}
	}

	public void displayProductDetails() {
		System.out.println("The product code is " + product.getProductCode());
		System.out.println("The product name is " + product.getProductName());
		System.out.println("The product description is " + product.getProductDescription());
		System.out.println("The product price is " + product.getProductPrice());
		System.out.println("The product open date is " + product.getOpenDate());
		System.out.println("The product validity date is " + product.getValidityDate());
		System.out.println("The product expiry date is " + product.getExpiryDate());
		System.out.println("The product is active - " + product.isActive());

	}
}
