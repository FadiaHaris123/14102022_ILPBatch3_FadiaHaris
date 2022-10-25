package com.experion.entity;

import java.util.ArrayList;

public class Customer {
	private String customerId;
	private String customerName;
	private ArrayList<Account> account;
	
	
	public Customer(String customerId, String customerName, ArrayList<Account> account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.account = account;
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


	public ArrayList<Account> getAccount() {
		return account;
	}


	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}
	
	

}
