package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.BankService;
import com.bank.entity.Product;
import com.bank.service.Service;


public class BankUtility {

	public static void main(String[] args) {

		ArrayList<BankService> serviceList = Service.createBankServices(); // creating list of services to be provided
																			// to the customer
		ArrayList<Product> productList = Service.createProduct(serviceList); // product list is created with
																				// productcode,name,set of services
		int customerId = 0;
		
		int mainChoice;
		char choice;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("*****************Welcome To Bank*****************");
			System.out.println("1.Create Accounts\r\n"
					+ "\r\n"
					+ "2.Manage Accounts\r\n"
					+ "\r\n"
					+ "3.Exit");
			System.out.println("Enter your choice :");
			mainChoice = scanner.nextInt();
			switch(mainChoice) {
				
			case 1: System.out.println("Enter the customer Id :");
					int customerIdEntered = scanner.nextInt();
					//boolean validCustomerId = Service.checkCustomerId(customerList,customerId);
					if(customerIdEntered!=customerId) {		//checking if a particular customer already present or not
						System.out.println("Customer Id not available.Create a new Account");
						System.out.println("****Accounts Available***********\r\n"
								+ "\r\n"
								+ "1. Savings Max Account\r\n"
								+ "\r\n"
								+ "2. Current Account\r\n"
								+ "\r\n"
								+ "3. Loan Account");
						System.out.println("Enter Your choice:");
						int customerChoice = scanner.nextInt();
						switch(customerChoice) {
						case 1 : Service.createAccount(customerChoice,));
								 break;
//						case 2 :customerList.add(Services.createAccount(customerChoice));
//						 		break;
//						case 3 :customerList.add(Services.createAccount(customerChoice));
//				 				break;
						}
					}
					else {
						
					}
			}
			System.out.println("Do you want to continue(Y/N):");
			choice=scanner.next().charAt(0);
		}while(choice=='y');

}
}
