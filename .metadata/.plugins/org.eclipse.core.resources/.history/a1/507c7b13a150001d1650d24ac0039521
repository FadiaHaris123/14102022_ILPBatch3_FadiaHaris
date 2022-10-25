package com.ilpexperion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilpexperion.entity.Customer;
import com.ilpexperion.services.Services;

public class BankUtility {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();  //customerList created to store all customer details
		int mainChoice;
		char choice;
		int cid=0;
		
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
					String customerId = scanner.nextLine();
					boolean validCustomerId = Services.checkCustomerId(customerList,customerId);
					if(validCustomerId) {		//checking if a particular customer already present or not
						
					}
					else {
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
						case 1 : customerList.add(Services.createAccount(customerChoice));
								 break;
						case 2 :customerList.add(Services.createAccount(customerChoice));
						 		break;
						case 3 :customerList.add(Services.createAccount(customerChoice));
				 				break;
						}
					}
			}
			System.out.println("Do you want to continue(Y/N):");
			choice=scanner.next().charAt(0);
		}while(choice=='y');

}
}
