package com.bank.entity;

import java.util.ArrayList;

public class Service {

	private String serviceCode;
	private String serviceName;

	public Service(String serviceCode, String serviceName) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
	}

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public static void displayAccount(ArrayList<Customer> customerList, String customerCode) {
		// TODO Auto-generated method stub
		System.out
				.println("CustomerCode		CustomerName       AccountCode		 AccountType                Balance");
		for (Customer customer : customerList) {
			if (customer.getCustomerId().equalsIgnoreCase(customerCode)) {
				ArrayList<Account> accountList = customer.getAccountList();
				for (Account account : accountList) {
					if (account != null) {
						System.out.println(customer.getCustomerId() + "  			 " + customer.getCustomerName() + " 			 "
								+ account.getProductCode()+ "   	" + account.getProductName() + "   			  "
								+ account.getAccountBalance());
						System.out.println("The Account Services are : ");
						for (Service bankService : account.getServiceList()) {
							System.out.println(bankService.getServiceName());
						}

					}
				}
			}
		}
	}

}
