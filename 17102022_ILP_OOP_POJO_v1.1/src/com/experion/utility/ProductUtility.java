package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {

		Service service = new Service();
		service.inputProductDetails();
		service.displayProductDetails();

	}

}
