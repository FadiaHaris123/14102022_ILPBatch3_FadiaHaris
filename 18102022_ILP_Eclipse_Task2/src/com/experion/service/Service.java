package com.experion.service;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	Product product = null;

	public static Product createProduct() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code - ");
		String productCode = scanner.nextLine();

		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();

		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();

		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();

		System.out.println("Enter Product Open Date (dd-MM-yyyy) : ");

		String openStringDate = scanner.nextLine();

		Date openDate = new SimpleDateFormat("dd-MM-yyyy").parse(openStringDate);

		System.out.println("Enter Product Validity: (dd-MM-yyyy) ");
		String validityStringDate = scanner.nextLine();
		Date validityDate = new SimpleDateFormat("dd-MM-yyyy").parse(validityStringDate);

		System.out.println("Enter Product expiry Date:(dd-MM-yyyy) ");
		String expiryStringDate = scanner.nextLine();

		Date expiryDate = new SimpleDateFormat("dd-MM-yyyy").parse(expiryStringDate);

//		System.out.println("Enter Product Active or not: ");
//		boolean active = scanner.nextBoolean();

		Product product = new Product(productCode, productName, productDescription, productPrice, openDate,
				validityDate, expiryDate);
		
		product.setSerialNo(product.getSerialNo() + 1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product; // returns created product

	}

	public static void displayProductDetails(ArrayList<Product> productList) {

		for (Product product : productList) {
			System.out.println("Seial No" + "   " + "Product Name " + "		" + "Product Description" + "		"
					+ "Product Price" + "			" + "Open Date" + "		" + "Expiry Date" + "  ");
			System.out.println(product.getSerialNoOriginal() + "   " + product.getProductName() + "				"
					+ product.getProductDescription() + "				" + product.getProductPrice() + "		"
					+ product.getOpenDate() + "		" + product.getExpiryDate());
		}

	}
	
//	public static Date convertStringtoDate(String date) throws ParseException
//	{
//		
//		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		Date covertedDate = formatter.parse(date);
//		return covertedDate;
//	}

	public static void displayValidProducts(ArrayList<Product> productList, int serialNumber) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = new Date();

		for (Product product : productList) {
			if (product.getSerialNoOriginal() == serialNumber) {
				if (currentDate.after(product.getOpenDate())) {

					if (currentDate.before(product.getValidityDate())) {

						if (currentDate.before(product.getExpiryDate())) {
							System.out.println("You can Purchase");
						} else {
							System.out.println("Product Expired");
						}

					} else {
						System.out.println("Validity Expired");
					}

				} else if (currentDate.equals(product.getValidityDate())) {
					System.out.println("Last date of purchase");
				} else {
					System.out.println("Product not yet available for purchase");
				}

			}

		}
	}
}
