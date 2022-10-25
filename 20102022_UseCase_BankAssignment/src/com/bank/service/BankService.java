package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService {

	static Scanner scanner = new Scanner(System.in);

	public static ArrayList<Service> createServices() {

		ArrayList<Service> allServiceList = new ArrayList<Service>();

		allServiceList.add(new Service("SCD100", "Cash Deposit"));
		allServiceList.add(new Service("ATMW200", "ATM Withdrawal"));
		allServiceList.add(new Service("SOB300", "Online Banking"));
		allServiceList.add(new Service("SMB400", "Mobile Banking"));
		allServiceList.add(new Service("SCHQD500", "Cheque Deposit"));

		return allServiceList; // List of all services is created and returned
	}

	public static ArrayList<Product> createProducts(ArrayList<Service> allServiceList, ArrayList<Product> productList) {
		
		productList.add(createSavingsMaxAccount(allServiceList));
		productList.add(createCurrentAccount(allServiceList));
		productList.add(createLoanAccount(allServiceList));
		return productList;

	}

	public static Product createCurrentAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> savingsServiceList = new ArrayList<Service>();

		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("Cheque Deposit") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Mobile Banking") == 0)) {
				savingsServiceList.add(service);
			}
		}
		Product product = new Account("CA100", "Current Account", savingsServiceList, 10000);
		return product;

	}

	public static Product createSavingsMaxAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> savingsServiceList = new ArrayList<Service>();

		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("Cheque Deposit") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Mobile Banking") == 0)) {
				savingsServiceList.add(service);
			}
		}
		Product product = new Account("SMA100", "Savings Max Account", savingsServiceList, 10000);

		return product;

	}

	private static Product createLoanAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> loanServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("Cheque Deposit") == 0)) {
				loanServiceList.add(service);
			}
		}
		Product product = new Account("PRDLOAN100", "Loan Account", loanServiceList, 10000);
		return product;

	}

	public static ArrayList<Customer> createAccount(ArrayList<Customer> customerList, ArrayList<Product> productList) {
		// TODO Auto-generated method stub

		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		if (!customerList.isEmpty()) {
			for (Customer customer : customerList) {
				if (customer.getCustomerId().equalsIgnoreCase(customerIdEnter)) {
					System.out.println("Customer already exists, able to create new type of account");
					customerList = createAccountForExistingCustomer(customerIdEnter, customerList, productList);
				} else {
					System.out.println("Customer Id not available. Create new Account");
					customerList = createAccountForNewCustomer(customerList, productList);
				}
			}
		} else {
			System.out.println("Customer Id not available. Create new Account");
			customerList = createAccountForNewCustomer(customerList, productList);
		}
		return customerList;

	}

	
	private static ArrayList<Customer> createAccountForNewCustomer(ArrayList<Customer> customerList,
			ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		Account account = null;
		ArrayList<Service> serviceList = null;
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Code :");
		String customerCode = scanner.nextLine();
		System.out.println("Enter the Customer Name :");
		String customerName = scanner.nextLine();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();

		Customer customer = null;
		ArrayList<Account> accountList = new ArrayList<Account>();

		switch (accountChoice) {
		case 1:
			for (Product product : productList) {
				if (product.getProductName().equalsIgnoreCase("Savings Max Account")) {
					serviceList = product.getServiceList();
				}

			}
			account = new Account(accountCode, "Savings Max Account", serviceList, 0);
			accountList.add(account);
			customer = new Customer(customerCode, customerName, accountList);
			System.out.println("Savings Max Account is created for " + customerName + "......Account is Active !!");
			break;
		case 2:
			for (Product product : productList) {
				if (product.getProductName().equalsIgnoreCase("Current Account")) {
					serviceList = product.getServiceList();
				}

			}
			account = new Account(accountCode, "Current Account", serviceList, 0);
			accountList.add(account);
			customer = new Customer(customerCode, customerName, accountList);
			System.out.println("Current Account is created for " + customerName + "......Account is Active !!");
			break;
		case 3:
			for (Product product : productList) {
				if (product.getProductName().equalsIgnoreCase("Loan Account")) {
					serviceList = product.getServiceList();
				}

			}
			account = new Account(accountCode, "Loan Account", serviceList, 0);
			accountList.add(account);
			customer = new Customer(customerCode, customerName, accountList);
			System.out.println("Loan Account is created for " + customerName + "......Account is Active !!");
			break;

		default:
			System.out.println("Invalid Entry...");
		}
		System.out.println("Available Services for you are...");
		for (Service service : serviceList) {
			System.out.println(service.getServiceName());
		}
		customerList.add(customer);
		return customerList;
	}

	private static ArrayList<Customer> createAccountForExistingCustomer(String customerIdEnter,
			ArrayList<Customer> customerList, ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		Account account = null; // going to create an account for already existing person
		String customerName = null;
		ArrayList<Service> serviceList = null;
		System.out.println("Available Accounts to Create");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		for (Customer customer : customerList) {
			if (customer.getCustomerId().equalsIgnoreCase(customerIdEnter)) {
				customerName = customer.getCustomerName();
				switch (accountChoice) {
				case 1:
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Savings Max Account")) {
							serviceList = product.getServiceList();
						}

					}
					account = new Account(accountCode, "Savings Max Account", serviceList, 0);
					customer.getAccountList().add(account);
					System.out.println(
							"Savings Max Account is created for " + customerName + "......Account is Active !!");
					System.out.println("Available Services for you are...");
					for (Service service : account.getServiceList()) {
						System.out.print(service.getServiceName() + "  ");
					}
					break;
				case 2:
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Current Account")) {
							serviceList = product.getServiceList();
						}

					}
					account = new Account(accountCode, "Current Account", serviceList, 0);
					customer.getAccountList().add(account);
					System.out.println("Current Account is created for " + customerName + "......Account is Active !!");
					break;
				case 3:
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Loan Account")) {
							serviceList = product.getServiceList();
						}

					}
					account = new Account(accountCode, "Loan Account", serviceList, 0);
					customer.getAccountList().add(account);
					System.out.println("Loan Account is created for " + customerName + "......Account is Active !!");
					break;
				default:
					System.out.println("Invalid Entry...");
				}
				
			}
		}

		return customerList;
	}

	public static ArrayList<Customer> manageAccount(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

		int useChoice;
		System.out.println("Enter Customer Id");
		String customerId = scanner.nextLine();
		String customerName = null;
		ArrayList<Account> accountList = null;
		ArrayList<Service> serviceList = null;
		int found = 0;
		String accountType = null;
		for (Customer customer : customerList) {
			if (customer.getCustomerId().equalsIgnoreCase(customerId)) {
				found = 1;
				customerName = customer.getCustomerName();
				accountList = customer.getAccountList();
			}

		}
		if (found == 0) {
			System.out.println("Invalid Customer Id entered!!");
		} else {
			System.out.println(customerName + "has following accounts created");
			for (Account account : accountList) {
				if (account != null)
					System.out.println(account.getProductName());
			}

			System.out.println("Enter the account type: ");
			accountType = scanner.nextLine();
			switch (accountType) {
			case "Savings Max Account":
				System.out.println("1.Deposit	2. Withdraw  3.Display Accounts ");
				System.out.println("Enter your choice: ");
				useChoice = scanner.nextInt();
				double amount;
				switch (useChoice) {
				case 1:

					System.out.println("Enter the amount to be deposited: ");
					for (Account account : accountList) {
						if (account.getProductName().equalsIgnoreCase("SavingsMaxAccount"))
							account.setAccountBalance(account.getAccountBalance() + scanner.nextInt());
					}
					break;
				case 2:
					System.out.println("Enter the amount to be deposited: ");
					for (Account account : accountList) {
						if (account.getProductName().equalsIgnoreCase("SavingsMaxAccount"))
							account.setAccountBalance(account.getAccountBalance() - scanner.nextInt());
					}
					break;
				case 3:
					Service.displayAccount(customerList, customerId);
					break;
				}
				break;
			case "Current Account":
				System.out.println("1.Deposit	2. Withdraw  3.Display Accounts ");
				System.out.println("Enter your choice: ");
				useChoice = scanner.nextInt();
				switch (useChoice) {
				case 1:

					System.out.println("Enter the amount to be deposited: ");
					for (Account account : accountList) {
						if (account.getProductName().equalsIgnoreCase("SavingsMaxAccount"))
							account.setAccountBalance(account.getAccountBalance() + scanner.nextInt());
					}
					break;
				case 2:
					System.out.println("Enter the amount to be deposited: ");
					for (Account account : accountList) {
						if (account.getProductName().equalsIgnoreCase("SavingsMaxAccount"))
							account.setAccountBalance(account.getAccountBalance() - scanner.nextInt());
					}
					break;
				case 3:
					Service.displayAccount(customerList, customerId);
					break;
				}
				break;
			case "Loan Account":
				System.out.println("1.Deposit  3.Display Accounts ");
				System.out.println("Enter your choice: ");
				useChoice = scanner.nextInt();
				switch (useChoice) {
				case 1:

					System.out.println("Enter the amount to be deposited: ");
					for (Account account : accountList) {
						if (account.getProductName().equalsIgnoreCase("SavingsMaxAccount"))
							account.setAccountBalance(account.getAccountBalance() + scanner.nextInt());
					}
					break;
				case 2:
					Service.displayAccount(customerList, customerId);
					break;
				}
				break;
			default:
				System.out.println("Invalid Selection");
			}
		}
		return customerList;
	}

}
