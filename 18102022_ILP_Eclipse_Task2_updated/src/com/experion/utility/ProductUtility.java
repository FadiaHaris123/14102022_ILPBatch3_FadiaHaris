package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {

		int mainChoice;
		char employeeChoice;
		char customerChoice;
		int serialNumber;
		Scanner scanner = new Scanner(System.in);
//		Product productList[] = new Product[3];
		ArrayList<Product> productList=new ArrayList<Product>();
		System.out.println("****************Welcome**************");
		do {
			System.out.println("1. Employee  2. Customer");
			mainChoice = scanner.nextInt();
			switch(mainChoice)
			{
			case 1 : do {
						System.out.println("1.Add Product  2.Display Product");
						int choice = scanner.nextInt();
						switch(choice) {
							case 1: try {
								productList.add(Service.createProduct());
							} catch (ParseException e) {
								e.printStackTrace();
							}
									break;
							case 2: if (productList.isEmpty()) {
										System.out.println("No Available Product to Display");
									} else {
										Service.displayProductDetails(productList);
									}
									break;
						}
						System.out.println("Do you want to continue ? y/n");
						employeeChoice = scanner.next().charAt(0);
						}while(employeeChoice=='y');
						break;
			case 2: do {
						System.out.println("1.Display Product  2.Purchase Product");
						int choice = scanner.nextInt();
						switch(choice) {
							case 1: if (productList.isEmpty()) {
										System.out.println("No Available Product to Display");
									} else {
										Service.displayProductDetails(productList);
									}
									break;
							case 2: if (productList.isEmpty()) {
										System.out.println("No Available Product to Purchase");
									} else {
										do {
											System.out.println("Enter Serial Number of the product you wish to Purchase");
											serialNumber = scanner.nextInt();
											Service.displayValidProducts(productList, serialNumber);
											System.out.println("Do you wish to Purchase other product : y/n ");
											customerChoice = scanner.next().charAt(0);
										}while(customerChoice=='y');
									}
									break;
								}
								System.out.println("Dear customer do you wish to continue ? y/n");
								customerChoice = scanner.next().charAt(0);
						}while(customerChoice=='y');
			}
			System.out.println("Exit from the App - y/n");
			mainChoice = scanner.next().charAt(0);
		}while(mainChoice=='n');
		System.out.println("Thank you");
	}
	
	
	
}
