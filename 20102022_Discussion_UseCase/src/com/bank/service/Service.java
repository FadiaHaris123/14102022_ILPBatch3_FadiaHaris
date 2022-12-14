package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.BankService;
import com.bank.entity.Customer;
import com.bank.entity.Product;

public class Service {

	public static ArrayList<BankService> createBankServices() {

		ArrayList<BankService> serviceList = new ArrayList<BankService>();

		serviceList.add(new BankService("SCD100", "Cash Deposit"));
		serviceList.add(new BankService("ATMW200", "ATM Withdrawal"));
		serviceList.add(new BankService("SOB300", "Online Banking"));
		serviceList.add(new BankService("SMB400", "Mobile Banking"));
		serviceList.add(new BankService("SCHQD500", "Cheque Deposit"));

		return serviceList; // List of all services is created and returned
	}

	public static ArrayList<Product> createProduct(ArrayList<BankService> serviceList) {

		ArrayList<BankService> savingsMaxAccountServiceMapping = new ArrayList<BankService>();
		ArrayList<BankService> currentAccountServiceMapping = new ArrayList<BankService>();
		ArrayList<BankService> loanAccountServiceMapping = new ArrayList<BankService>();
		// Certain Products have certain services which are mapped to a list

		for (BankService bankService : serviceList)
			if ((bankService.getServiceCode().compareTo("SCD100") == 0)
					|| (bankService.getServiceCode().compareTo("ATMW200") == 0)
					|| (bankService.getServiceCode().compareTo("SOB300") == 0))
				savingsMaxAccountServiceMapping.add(bankService);
			else if ((bankService.getServiceCode().compareTo("SCD100") == 0)
					|| (bankService.getServiceCode().compareTo("ATMW200") == 0)
					|| (bankService.getServiceCode().compareTo("SOB300") == 0)
					|| (bankService.getServiceCode().compareTo("SMB400") == 0))
				currentAccountServiceMapping.add(bankService);
			else if ((bankService.getServiceCode().compareTo("SCHQD500") == 0)
					|| (bankService.getServiceCode().compareTo("SCD100") == 0)) 
				loanAccountServiceMapping.add(bankService);
	
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product("SMA100", "Savings Max Account", savingsMaxAccountServiceMapping));
		productList.add(new Product("CA100", "Current Account", currentAccountServiceMapping));
		productList.add(new Product("SMA100", "Loan Account", loanAccountServiceMapping));

		return productList;
	}

	public static void createAccount(int customerChoice) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		if(customerChoice==1) {
			
			
			System.out.println("Enter the Customer Code: ");
			String customerCode = scanner.nextLine();
			System.out.println("Enter the Customer Name:");
			String customerName = scanner.nextLine();
			Customer customer = new Customer(customerCode,customerName,);
		}
		
	}
	
}