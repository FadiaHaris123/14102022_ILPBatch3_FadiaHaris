package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.entity.Service;
import com.experion.service.BankServices;

public class BankUtility 
{

	public static void main(String[] args) 
	{
		    String UChoice;
		    String customerId;
		    Scanner scanner=new Scanner(System.in);
			ArrayList<Product> productList = new ArrayList<Product>();
			ArrayList<Service> allServicesList = new ArrayList<Service>();
			ArrayList<Service> allProductList = new ArrayList<Service>();
			Customer customer = null;
			
			
			allServicesList=BankServices.createService();
			
			
			
			do
			{
			System.out.println(" 1.Create Account\n 2.Manage account\n 3.Display Accounts\n 4.Exit\n");
			System.out.println("Enter your Choice:\n");
			int choice = scanner.nextInt();
			 boolean found = false;  
			 

			switch(choice) 
			{
			case 1:
				scanner.nextLine();
				System.out.println("Enter Customer ID:\n"); 
		        customerId = scanner.nextLine();
				

	                      
	               // found = BankServices.search(customerId,customerList); 
		        
	                if (customer!=null) 
	                { 
	                	System.out.println("Customer Exists");  
	                     
	                }  
	              
			        else if (!found) 
	                 {  
	                System.out.println("Customer Id not available.Create a new Account");  
	                System.out.println("********Accounts Available********");  
	                System.out.println("1.Savings Max Account\n,2.Current Account\n,3.Loan Account\n");
	                System.out.println("Enter your Choice:\n");
	                int Accountchoice = scanner.nextInt();
	                 switch(Accountchoice)
	                 {
	                 
	                 case 1:
	                	    
	                	 productList=BankServices.createProducts(allServicesList,allProductList);
	                	 customer= BankServices.createCustomer(productList);
	                	 break;
	                        
	                 case 2:
	                	 BankServices.createCurrentAccount(allServicesList,allProductList);
	                	 break;
	                	 
	                 
	                  }
	                 
	                 }
			case 3:
           	 
           	 BankServices.displayCustomer(customer);
	              
	       			
	}        
			scanner.nextLine();
			 System.out.println("Do you want to continue: press y");
			 UChoice=scanner.nextLine();
			}while(UChoice.compareTo("Y")==0||UChoice.compareTo("y")==0);

	}
}



