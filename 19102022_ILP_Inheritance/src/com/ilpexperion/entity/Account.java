package com.ilpexperion.entity;

import java.util.ArrayList;

public class Account extends Product {
	
	private String accountType;
	private ArrayList<BankServices> bankServicesList;
	
	public Account(String productCode, String productName, String productType, String accountType,
			ArrayList<BankServices> bankServicesList) {
		super(productCode, productName, productType);
		this.accountType = accountType;
		this.bankServicesList = bankServicesList;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public ArrayList<BankServices> getBankServicesList() {
		return bankServicesList;
	}

	public void setBankServicesList(ArrayList<BankServices> bankServicesList) {
		this.bankServicesList = bankServicesList;
	}
	
	
	
	
	}
