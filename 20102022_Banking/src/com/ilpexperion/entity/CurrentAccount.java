package com.ilpexperion.entity;

public class CurrentAccount extends Account {

	private String accountType;

	public CurrentAccount(String accountType, int balance) {
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
