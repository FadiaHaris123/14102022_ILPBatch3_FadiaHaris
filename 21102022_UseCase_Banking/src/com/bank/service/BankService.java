package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Service;

public class BankService {

	public static ArrayList<Service> createServices() {

		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking"));
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		allServiceList.add(new Service("Online Banking"));

		return allServiceList;

	}

	public static Customer createAccounts(ArrayList<Service> allServiceList) {

		ArrayList<Account> accountList = new ArrayList<Account>();
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		String customerCode;
		String customerName;
		int choice;
		int mainChoice;

		System.out.println("Enter the customer code");
		customerCode = scanner.nextLine();
		System.out.println("Enter the customer name");
		customerName = scanner.nextLine();

		do {
			System.out.println("1.Savings Max Account");
			System.out.println("2.Current Account");
			System.out.println("3.Loan Account");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			
			
			scanner.nextLine();

			switch (choice) {
			case 1:
				accountList.add(createSavingsMaxAccount(allServiceList));
				System.out.println("Savings Max Account created for " + customerName);
				break;

			case 2:
				accountList.add(createCurrentAccount(allServiceList));
				System.out.println("Current Account created for " + customerName);
				break;

			case 3:
				accountList.add(createLoanAccount(allServiceList));
				System.out.println("Loan Account created for " + customerName);
				break;

			}
			System.out.println("Do you want to continue creating other accounts? (y/n)");
			mainChoice = scanner.next().charAt(0);
		} while (mainChoice == 'y' || mainChoice == 'Y');

		customer = new Customer(customerCode, customerName, accountList);

		return customer;

	}

	private static Account createSavingsMaxAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> savingsServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Online Banking") == 0)) {
				savingsServiceList.add(service);
			}
		}

		System.out.println();
		System.out.println("Following are the services available for Savings Max Account");
		for (Service service : savingsServiceList) {
			System.out.print(service.getServiceName() + "	");
		}
		System.out.println();

		Account account = new Account("PRDSMA", "Savings Max Account", savingsServiceList,0.0);
		return account;

	}

	private static Account createCurrentAccount(ArrayList<Service> allServiceList) {
		ArrayList<Service> currentServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Online Banking") == 0)
					|| (service.getServiceName().compareTo("Mobile Banking") == 0)) {
				currentServiceList.add(service);
			}
		}

		System.out.println();
		System.out.println("Following are the services available for Current Account");
		for (Service service : currentServiceList) {
			System.out.print(service.getServiceName() + "	");
		}
		System.out.println();

		Account account = new Account("PRDCA", "Current Account", currentServiceList, 0.0);
		return account;
	}

	private static Account createLoanAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> loanServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("Cheque Deposit") == 0)) {
				loanServiceList.add(service);
			}
		}

		System.out.println();
		System.out.println("Following are the services available for Loan Account");
		for (Service service : loanServiceList) {
			System.out.print(service.getServiceName() + "	");
		}
		System.out.println();

		Account account = new Account("PRDLA", "Loan Account", loanServiceList, 0.0);
		return account;

	}

	public static void manageAccounts(Customer customer) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Account actionAccount=null;
		String accChoice;
		int actionChoice;
		int i = 1;

		accountList = customer.getAccountList();
		for (Account account : accountList) {
			System.out.println(i + ". " + account.getProductName());
			i++;
		}

		System.out.println("Enter your choice: (ex:Current Account)");
		accChoice = scanner.nextLine();
		
//		accountList = customer.getAccountList();
		for(Account account:accountList)
		{
			if(accChoice.compareTo(account.getProductName())==0)
				actionAccount = account;
		}

		if((accChoice.compareTo("Savings Max Account")==0)||(accChoice.compareTo("Current Account")==0))
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display");
			System.out.println("Enter your choice:");
			actionChoice = scanner.nextInt();
			
			switch(actionChoice)
			{
			case 1: deposit(actionAccount);
					break;
			case 2: withdraw(actionAccount);
					break;
			case 3: displayAccounts(customer);
					break;
			default: System.out.println("Invalid Choice");

			}
		}
		else if((accChoice.compareTo("Loan Account")==0))
		{
			System.out.println("1.Deposit");
			System.out.println("2.Display");
			System.out.println("Enter your choice:");
			actionChoice = scanner.nextInt();
			
			switch(actionChoice)
			{
			case 1: deposit(actionAccount);
					break;
			case 2: displayAccounts(customer);
					break;
			default: System.out.println("Invalid Choice");
			}
		}
		else
			System.out.println("Invalid choice");
		

	}

	private static void withdraw(Account account) {

		double amount;
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("Enter the amount to be withdrawn");
		amount = scanner.nextDouble();
		
		account.setAccountBalance(account.getAccountBalance()-amount);
		
		System.out.println("Amount have been withdrawn");		
	}

	private static void deposit(Account account) {

		double amount;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the amount to be deposited");
		amount = scanner.nextDouble();
		
		account.setAccountBalance(account.getAccountBalance()+amount);
		
		System.out.println("Amount have been deposited");
		System.out.println(account.getAccountBalance());
	}

	public static void displayAccounts(Customer customer) {

		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList = customer.getAccountList();
		
		System.out.println("Displaying account details of "+customer.getCustomerName()+" ("+customer.getCustomerCode()+")");
		System.out.println("AccountType"+"				"+"Account Balance");
		
		for(Account account:accountList)
		{
			System.out.println(account.getProductName()+"			"+account.getAccountBalance());	
		}
	}


}
