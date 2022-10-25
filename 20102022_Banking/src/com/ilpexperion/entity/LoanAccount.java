package com.ilpexperion.entity;

public class LoanAccount extends Account {

	private String accountType;

	public LoanAccount(String accountType, int balance) {
		super(accountType, balance);
		accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
