package com.experion.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class BankServices {

	String serviceCode;
	String serviceName;

	public BankServices() {

	}

	public BankServices(String serviceCode, String serviceName) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	Scanner scanner = new Scanner(System.in);

	public ArrayList<BankServices> addBankServices(String accountType) {
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		if (accountType == "SavingsMaxAccount") {
			bankServices.add(new BankServices("b1", "CashDeposit"));
			bankServices.add(new BankServices("b2", "ATMWithdrawal"));
			bankServices.add(new BankServices("b3", "OnlineBanking"));
		} else if (accountType == "CurrentAccount") {
			bankServices.add(new BankServices("b1", "CashDeposit"));
			bankServices.add(new BankServices("b2", "ATMWithdrawal"));
			bankServices.add(new BankServices("b3", "OnlineBanking"));
			bankServices.add(new BankServices("b4", "MobileBanking"));
		} else if (accountType == "LoanAccount") {
			bankServices.add(new BankServices("b1", "CashDeposit"));
			bankServices.add(new BankServices("b5", "ChequeDeposit"));
		}
		return bankServices;
	}

	public ArrayList<Customer> maxAccountService(ArrayList<Customer> customers, String customerCodeEnter) { //Services for ServiceMaxAccount
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		ArrayList<Account> accounts = new ArrayList<Account>() ;
		Account account = null;
		for(Customer customer : customers)
		{
			if(customer.getCustomerId().equalsIgnoreCase(customerCodeEnter))
			{
				accounts=customer.getAccount();
			}
		}
		for(Account accountTemp: accounts)
		{
			if(accountTemp.getAccountType().equalsIgnoreCase("SavingsMaxAccount"))
				account=accountTemp;
		}
		do {
			
			System.out.println("1.Cash Deposit\n2.ATM Withdrawal\n3.Online Banking");
			serviceChoice=scanner.nextInt();
			switch(serviceChoice)
			{
			case 1 : SavingsMaxAccount saveMax = (SavingsMaxAccount) account;
					account=saveMax.cashDeposit(account);
				break;
			case 2 : SavingsMaxAccount saveMax2 = (SavingsMaxAccount) account;
					account=saveMax2.atmWithdrawal(account);
				break;
			case 3 : SavingsMaxAccount saveMax3 = (SavingsMaxAccount) account;
					saveMax3.onlineBanking();
				break;
			default : System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue (y/n");
			continueChoice=scanner.next().charAt(0);
			
		}while(continueChoice=='y');
		return customers;
	}

	public ArrayList<Customer> currentAccountService(ArrayList<Customer> customers, String customerCodeEnter) { //services for current account
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		ArrayList<Account> accounts = new ArrayList<Account>() ;
		Account account = null;
		for(Customer customer : customers)
		{
			if(customer.getCustomerId().equalsIgnoreCase(customerCodeEnter))
			{
				accounts=customer.getAccount();
			}
		}
		for(Account accountTemp: accounts)
		{
			if(accountTemp.getAccountType().equalsIgnoreCase("CurrentAccount"))
				account=accountTemp;
		}
		do {
			
			System.out.println("1.Cash Deposit\n2.ATM Withdrawal\n3.Mobile Banking\n4.OnlineBanking");
			serviceChoice=scanner.nextInt();
			switch(serviceChoice)
			{
			case 1 : CurrentAccount current = (CurrentAccount) account;
					account=current.cashDeposit(account);
				break;
			case 2 : CurrentAccount current2 = (CurrentAccount) account;
					account=current2.atmWithdrawal(account);
				break;
			case 3 : CurrentAccount current3 = (CurrentAccount) account;
					current3.mobileBanking();
			case 4 : CurrentAccount current4 = (CurrentAccount) account;
					current4.onlineBanking();
				break;
			default : System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this service (y/n");
			continueChoice=scanner.next().charAt(0);
			
		}while(continueChoice=='y');
		return customers;
		
	}

	public ArrayList<Customer> loanAccountService(ArrayList<Customer> customers, String customerCodeEnter) { //services for Loan Account
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		ArrayList<Account> accounts = new ArrayList<Account>() ;
		Account account = null;
		for(Customer customer : customers)
		{
			if(customer.getCustomerId().equalsIgnoreCase(customerCodeEnter))
			{
				accounts=customer.getAccount();
			}
		}
		for(Account accountTemp: accounts)
		{
			if(accountTemp.getAccountType().equalsIgnoreCase("LoanAccount"))
				account=accountTemp;
		}
		do {
			
			System.out.println("1.Cash Deposit\n2.Cheque Deposit");
			serviceChoice=scanner.nextInt();
			switch(serviceChoice)
			{
			case 1 : LoanAccount loan = (LoanAccount) account;
					account=loan.cashDeposit(account);
				break;
			case 2 : LoanAccount current2 = (LoanAccount) account;
					account=current2.chequeDeposit(account);
				break;
			default : System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this service (y/n");
			continueChoice=scanner.next().charAt(0);
			
		}while(continueChoice=='y');
		return customers;
		
	}
	
	

}
