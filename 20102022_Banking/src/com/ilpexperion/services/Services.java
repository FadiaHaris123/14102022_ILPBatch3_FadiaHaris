package com.ilpexperion.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.CurrentAccount;
import com.ilpexperion.entity.Customer;
import com.ilpexperion.entity.LoanAccount;
import com.ilpexperion.entity.SavingsMaxAccount;

public class Services {

	public static boolean checkCustomerId(ArrayList<Customer> customerList,String customerId){
		
		for(Customer customer:customerList) {
			if((customer.getCustomerId()).compareTo(customerId)==0) {
				return true;
			}
		}
		return false;
	}

	public static Customer createAccount(int customerChoice) {
		// TODO Auto-generated method stub
		Customer customer = null;
		if(customerChoice==1) {
			SavingsMaxAccount account = new SavingsMaxAccount("Savings Max Account",0);
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the Customer Code:");
			String customerId = scanner.nextLine();
			System.out.println("Enter Customer Name: ");
			String customerName = scanner.nextLine();
			System.out.println("Savings Max Account created for"+ customerName +"\r\n"
					+ "\r\n"
					+ "Account is active.!!!!!! \r\n"
					+ "\r\n"
					+ "You have the following services \r\n"
					+ "\r\n"
					+ "CashDeposit,ATMWithdrawl,OnlineBanking ");
			customer = new Customer("Savings Max Account",0,customerId,customerName,account);
		}
		else if(customerChoice==2) {
			CurrentAccount account = new CurrentAccount("Savings Max Account",0);
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the Customer Code:");
			String customerId = scanner.nextLine();
			System.out.println("Enter Customer Name: ");
			String customerName = scanner.nextLine();
			System.out.println("CurrentAccount created for"+ customerName +"\r\n"
					+ "\r\n"
					+ "Account is active.!!!!!! \r\n"
					+ "\r\n"
					+ "You have the following services \r\n"
					+ "\r\n"
					+ "CashDeposit,OnlineBanking,ATMWithdrawl,MobileBanking ");
			customer = new Customer("Current Account",0,customerId,customerName,account);
		}
		else if(customerChoice==3) {
			LoanAccount account = new LoanAccount("Loan Account",0);
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the Customer Code:");
			String customerId = scanner.nextLine();
			System.out.println("Enter Customer Name: ");
			String customerName = scanner.nextLine();
			System.out.println("LoanAccount created for"+ customerName +"\r\n"
					+ "\r\n"
					+ "Account is active.!!!!!! \r\n"
					+ "\r\n"
					+ "You have the following services \r\n"
					+ "\r\n"
					+ "CashDeposit,ChequeDeposit ");
			customer = new Customer("Current Account",0,customerId,customerName,account);
		}
		return customer;
		
	}
}
