package com.experion.entity;

import java.util.ArrayList;

public class Customer 
{
 private String customerName;
 private String customerId;
 
 ArrayList<Product>accountList=new ArrayList<Product>();

public Customer(String customerId, String customerName, ArrayList<Product> accountList) 
{
	
	
	this.customerId = customerId;
	this.customerName = customerName;
	this.accountList = accountList;
}

public Customer() {
	// TODO Auto-generated constructor stub
}

public String getCustomerName() 
{
	return customerName;
}

public void setCustomerName(String customerName) 
{
	this.customerName = customerName;
}

public String getCustomerId() 
{
	return customerId;
}

public void setCustomerId(String customerId) 
{
	this.customerId = customerId;
}

public ArrayList<Product> getAccountList() 
{
	return accountList;
}

public void setAccountList(ArrayList<Product> accountList) 
{
	this.accountList = accountList;
}
 
 
 
 
}
