package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.entity.Service;

public class BankServices 
{
	
 

public static ArrayList<Service>createService()
{
	ArrayList<Service>allServiceList = new ArrayList<Service>();
	
	allServiceList.add(new Service("cash deposit"));
	allServiceList.add(new Service("cheque deposit"));
	allServiceList.add(new Service("atm withdrawal"));
	allServiceList.add(new Service("mobile banking"));
	return allServiceList;
	
	
	}

public static ArrayList<Service>createAccounts()
{

	ArrayList<Service>allProductList = new ArrayList<Service>();
	allProductList.add(new Service("Savings Max Account"));
	allProductList.add(new Service("Current Account"));
	allProductList.add(new Service("Loan account"));
	
	
	return allProductList;

}


public static ArrayList<Product>createProducts(ArrayList<Service>allServiceList,ArrayList<Service>allProductList )
{
	ArrayList<Product>productList = new ArrayList<Product>();
	productList.add(createSavingsMaxAccount(allServiceList,allProductList));
	productList.add(createCurrentAccount(allServiceList,allProductList));
	return productList;
	
}


public static Customer createCustomer(ArrayList<Product>allProductList)
{
	String customercode;
	String customername;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your customer Id: \n");
	customercode= scanner.nextLine();
	System.out.println("Enter your customer Name: \n");
    customername=scanner.nextLine();
    Customer customer=new Customer(customercode,customername,allProductList);
    System.out.println(" Created Sucesfully  for "+customer.getCustomerName());

    return customer;
}




public static Product createSavingsMaxAccount(ArrayList<Service>allServiceList,ArrayList<Service>allProductList)
{
	ArrayList<Service>savingsServiceList=new ArrayList<Service>();
	ArrayList<Service>savingsProductList=new ArrayList<Service>();
	
    
    for(Service service : allProductList)
	{
    	if(service.getServiceName().compareTo("Savings Max Account")==0);
    	{
    		savingsProductList.add(service);
    	}
	}
	for(Service service : allServiceList)
	{
		if((service.getServiceName().compareTo("cash deposit")==0) || (service.getServiceName().compareTo("cheque deposit")==0) || (service.getServiceName().compareTo("atm withdrawal")==0) || (service.getServiceName().compareTo("mobile banking")==0) )
		{
			savingsServiceList.add(service);
		}
	}
	Product product = new Account("SMA100", "Savings Max Account",savingsServiceList,10000);
	
		
	return product;
		
}

public static Product createCurrentAccount(ArrayList<Service>allServiceList,ArrayList<Service>allProductList)
{
	ArrayList<Service>savingsServiceList=new ArrayList<Service>();
	ArrayList<Service>savingsProductList=new ArrayList<Service>();
	String customercode;
	String customername;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your customer Id: \n");
	customercode= scanner.nextLine();
	System.out.println("Enter your customer Name: \n");
    customername=scanner.nextLine();
    
    
    for(Service service : allProductList)
	{
    	if(service.getServiceName().compareTo("Current Account")==0);
    	{
    		savingsProductList.add(service);
    	}
	}
	for(Service service : allServiceList)
	{
		if((service.getServiceName().compareTo("cash deposit")==0) || (service.getServiceName().compareTo("cheque deposit")==0) || (service.getServiceName().compareTo("atm withdrawal")==0) || (service.getServiceName().compareTo("mobile banking")==0) )
		{
			savingsServiceList.add(service);
		}
	}
	Product product = new Account("CA100", "Current Account",savingsServiceList,10000);
	return product;
		
}

public static boolean search(String customercode,ArrayList<Customer> customerList)
{
	for(Customer customer : customerList )
	
	 
		if (customercode.equals(customer.getCustomerId())) 
		{
		   
		        return (true);
		    }
	
        return (false);
	
}

public static void displayCustomer(Customer customer) {
	for(Product product:customer.getAccountList())
	{
		System.out.println(customer.getCustomerId()+""+product.getProductName());
	}
	
}  
}

