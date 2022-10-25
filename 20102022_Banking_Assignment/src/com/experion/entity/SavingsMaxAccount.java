package com.experion.entity;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.service.SavingsCurrentService;

public class SavingsMaxAccount extends Account implements SavingsCurrentService{


	public SavingsMaxAccount(String accountCode, String accountType, double accountBalance,
			ArrayList<BankServices> bankservices) {
		super(accountCode, accountType, accountBalance, bankservices);
		// TODO Auto-generated constructor stub
	}
	
	Scanner scanner = new Scanner(System.in);
	@Override
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+cashDeposit);
		return account;

	}

	@Override
	public Account atmWithdrawal(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be withdrawed");
		double cashWithdrawal=scanner.nextDouble();
		if(account.getAccountBalance()>0)
			account.setAccountBalance(account.getAccountBalance()-cashWithdrawal);
		else
			System.out.println("No Account Balance");
		return account;
	}

	@Override
	public void onlineBanking() {
		// TODO Auto-generated method stub
		System.out.println("Online Banking Services are Currently Unavailable");
	}

}
