package com.experion.entity;

import java.util.ArrayList;

public abstract class Account {
	private String accountCode;
	private String accountType;
	private double accountBalance;
	private ArrayList<BankServices> bankservices;
	
	public Account(String accountCode, String accountType, double accountBalance,
			ArrayList<BankServices> bankservices) {
		super();
		this.accountCode = accountCode;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.bankservices = bankservices;
	}



	public String getAccountCode() {
		return accountCode;
	}


	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}


	public ArrayList<BankServices> getBankservices() {
		return bankservices;
	}


	public void setBankservices(ArrayList<BankServices> bankservices) {
		this.bankservices = bankservices;
	}


	


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public abstract Account cashDeposit(Account account); //abstract function for cash deposit

}
