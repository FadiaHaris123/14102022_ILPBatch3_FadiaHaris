package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;
import com.bank.service.BankService;



public class BankUtility {

	public static void main(String[] args) {
		
		int mainChoice;
		ArrayList<Product> productList = new ArrayList<Product>();  //creating productList to store products
		ArrayList<Service> allServicesList = new ArrayList<Service>();  //creating serviceList to store services
		ArrayList<Customer> customerList = new ArrayList<Customer>(); //customer list to store all customers
		Scanner scanner = new Scanner(System.in);
		
		allServicesList=BankService.createServices(); //services created and stored to list
		productList = BankService.createProducts(allServicesList,productList); //products created and stored to list

		//System.out.println(productList.get(0).getServiceList().get(0).getServiceCode());
		do {
			System.out.println("****Welcome to Bank*****");
			System.out.println("1.Create Account\n2.Manage Accounts\n3.Display Accounts\n4.Exit");
			System.out.println("Enter your choice");
			mainChoice=scanner.nextInt();
			switch(mainChoice) {
			case 1 : customerList=BankService.createAccount(customerList,productList);
					break;
			case 2 : customerList=BankService.manageAccount(customerList);
					break;
			case 3: System.out.println("Enter customer code");
					scanner.nextLine();
					String customerCode = scanner.nextLine();
					Service.displayAccount(customerList, customerCode);
					break;
			case 4: System.exit(0);
			default : System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue in the program? (y/n)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice =='y');

	}}
