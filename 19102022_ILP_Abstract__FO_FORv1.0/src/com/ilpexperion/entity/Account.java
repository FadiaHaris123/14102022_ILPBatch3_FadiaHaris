package com.ilpexperion.entity;

import java.util.ArrayList;

import com.ilpexperion.service.AccountCardServices;

public class Account extends Product implements AccountCardServices{
	
	private String accountNumber;
	private double accountBalance;
	
	
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public void checkValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity Check of account class called..");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Checking Balance....");
	}

	@Override
	public void checkWithdraw() {
		// TODO Auto-generated method stub
		System.out.println("Checking cash withdrawed..");
	}
	
	
	
	}
