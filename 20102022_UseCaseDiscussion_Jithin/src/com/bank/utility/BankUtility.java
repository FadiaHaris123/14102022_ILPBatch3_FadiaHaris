package com.bank.utility;

import java.util.ArrayList;

import com.bank.entity.Product;
import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Service> allServicesList = new ArrayList<Service>();
		allServicesList=BankService.createServices();
		productList = BankService.createProducts(allServicesList);
		for(Product product : productList)
		{
			System.out.println(product.getProductName());
			for(Service service : product.getServiceList())
			{
				System.out.println(service.getServiceName());
			}

	}

	}}
