package com.bank.utility;

import java.util.Scanner;

import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int mainChoice;
		Service service = null; // service reference variable is created, if suppose before 1st choice is made 3
		// is chosen then a null object can be passed

		do {
			System.out.println("1. Create Service 2. Create Rate 3. Display Service Details 4. Exit");
			mainChoice = scanner.nextInt();
			switch (mainChoice) {
			case 1:
				service = BankService.createService();
				// service is created first then rate is fixed
				break;

			case 2:
				BankService.createRateCard(service);
				// rate for a service is created
				break;
			case 3:
				BankService.displayServiceDetails(service);
				// Display all the services
				break;
			case 4:
				System.exit(0);
			}

		} while (mainChoice != 4);
	}

}
