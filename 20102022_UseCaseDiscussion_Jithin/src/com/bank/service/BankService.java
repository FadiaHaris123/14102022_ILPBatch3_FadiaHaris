package com.bank.service;

import java.util.ArrayList;

import com.bank.entity.Account;
import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService {
	
	public static ArrayList<Service> createServices(){
		
		ArrayList<Service>allServiceList = new ArrayList<Service>();	
		allServiceList.add(new Service("Mobile Banking"));
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		
		return allServiceList;
		
	}
	public static ArrayList<Product> createProducts(ArrayList<Service> allServiceList){
		
		ArrayList<Product>productList = new ArrayList<Product>();	
//		productList.add(createSavingsMaxAccount(allServiceList));
//		productList.add(createCurrentAccount(allServiceList));
		productList.add(createLoanAccount(allServiceList));
		
		
		
		return productList;
		
	}
	private static  Product createLoanAccount(ArrayList<Service> allServiceList) {
		
		ArrayList<Service>loanServiceList = new ArrayList<Service>();
		for(Service service : allServiceList)
		{
			if((service.getServiceName().compareTo("Cash Deposit")==0) || (service.getServiceName().compareTo("Cheque Deposit")==0))
			{
				loanServiceList.add(service);
			}
		}
		Product product = new Account("PRDLOAN100", "Loan Account",loanServiceList,10000);
		return product;
		
	}
//	private static Product createCurrentAccount(ArrayList<Service> allServiceList) {
//		// TODO Auto-generated method stub
//		
//		return
//	}
//	private static Product createSavingsMaxAccount(ArrayList<Service> allServiceList) {
//		// TODO Auto-generated method stub
//		
//	}
//	
	
	

}
