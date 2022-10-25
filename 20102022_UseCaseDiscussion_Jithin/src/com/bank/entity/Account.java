package com.bank.entity;

import java.util.ArrayList;

public class Account extends Product {
	
	private double accountBalance;

	public Account(String productCode, String productName, ArrayList<Service> serviceList, double accountBalance) {
		super(productCode, productName, serviceList);
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
