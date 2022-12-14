package com.ilpexperion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilpexperion.entity.Product;
import com.ilpexperion.service.Service;

public class BankUtility {

	public static void main(String[] args) {

		char mainChoice;
		int serialNumber;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Product> productList = new ArrayList<Product>();

		do {
			System.out.println("************Welcome**********");
			System.out.println("1.Add Card Products 2.Add Account Products 3.Display Product ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
					productList.add(Service.createProduct("Cards")); //create card object and return
					break;
			case 2:
					productList.add(Service.createProduct("Accounts"));
					break;
			case 3:
					Service.displayProduct(productList);
					break;
			default : System.out.println("Invalid Entry!!!");
			}
			System.out.println("Do you want to continue - (y/n) - ");
			mainChoice= scanner.next().charAt(0);
		}while(mainChoice=='y');
	}
}
