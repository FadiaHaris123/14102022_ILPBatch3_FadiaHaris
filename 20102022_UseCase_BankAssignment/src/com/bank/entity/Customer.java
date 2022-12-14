package com.bank.entity;

import java.util.ArrayList;

public class Customer {

	private String customerId;
	private String customerName;
	private ArrayList<Account> accountList;
	
	public Customer(String customerId, String customerName, ArrayList<Account> accountList) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountList = accountList;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	

}
