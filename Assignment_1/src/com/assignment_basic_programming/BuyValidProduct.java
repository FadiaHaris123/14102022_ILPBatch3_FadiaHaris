package com.assignment_basic_programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//20. Program to enter the details of a product with validity date and expiry date. Ask the user to input 
//
//the purchase date and if the date entered is more than validity date print cannot buy else print purchased.  

public class BuyValidProduct {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Enter Product Code: ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name: ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description: ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price: ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine(); // Clear the buffer

		System.out.println("Enter Product Open Date (dd-MM-yyyy) : ");
		String openStringDate = scanner.nextLine();
		Date openDate = dateFormat.parse(openStringDate);
		
		System.out.println("Enter Product Validity: (dd-MM-yyyy) ");
		String validityStringDate = scanner.nextLine();
		Date validityDate = dateFormat.parse(validityStringDate);

		System.out.println("Enter Product expiry Date:(dd-MM-yyyy) ");
		String expiryStringDate = scanner.nextLine();
		Date expiryDate = dateFormat.parse(expiryStringDate);
		
		System.out.println("Enter Purchase Date:(dd-MM-yyyy) ");
		String purchaseStringDate = scanner.nextLine();
		Date purchaseDate = dateFormat.parse(purchaseStringDate);
		
				
		if ((purchaseDate.before(validityDate)) && (purchaseDate.before(expiryDate)) && (purchaseDate.after(openDate))) {
			
			System.out.println("You can purchase");

		}else {
			System.out.print("Cannot Buy this Product!!!");
		}
	}


}
