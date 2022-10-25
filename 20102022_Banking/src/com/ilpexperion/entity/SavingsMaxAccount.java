package com.ilpexperion.entity;

import java.util.Scanner;

import com.ilpexperion.services.SavingsMax_CurrentAccountServices;

public class SavingsMaxAccount extends Account implements SavingsMax_CurrentAccountServices{

	private String accountType;

	public SavingsMaxAccount(String accountType, int balance) {
		super(accountType, balance);
		accountType = accountType;
	}

	@Override
	public void cashDeposit() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited:");
		int amount = scanner.nextInt();
		
	}

	@Override
	public void atmWithdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnlineBanking() {
		// TODO Auto-generated method stub
		
	}
	
	
}
