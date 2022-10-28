package com.bank.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {

	public static Service createService() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the following details to create service");
		System.out.println("Service Code - ");
		String serviceCode = scanner.nextLine();
		System.out.println("Service Name - ");
		String serviceName = scanner.nextLine();
		System.out.println("Service Description - ");
		String serviceDescription = scanner.nextLine();
		System.out.println("Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Validity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Expiry Date - ");
		String expiryDate = scanner.nextLine();
		// input is taken

		// Date taken in the form of string is converted to date using function
		// stringToDate
		Date openDatesConverted = stringToDate(openDate);
		Date validityDateConverted = stringToDate(validityDate);
		Date expiryDateConverted = stringToDate(expiryDate);

		Service service = new Service(serviceCode, serviceName, serviceDescription, openDatesConverted,
				validityDateConverted, expiryDateConverted);
		// creation of service object
		return service;
	}

	private static Date stringToDate(String dateString) {
		// TODO Auto-generated method stub

		Date convertedDate = null;// main line
		try {
			convertedDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString); // main line
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return convertedDate;// main line

	}

	public static void createRateCard(Service service) {

		Scanner scanner = new Scanner(System.in);
		Rate rate = new Rate();

		int noOfTiers;
		System.out.println("************Enter the Rate Card for " + service.getServiceName() + " **************");
		System.out.println("Enter the number of tiers you want to add - ");
		noOfTiers = scanner.nextInt();
		int[] min = new int[noOfTiers];
		int[] max = new int[noOfTiers];
		double[] fees = new double[noOfTiers];

		for (int tier = 0; tier < noOfTiers; tier++) {
			System.out.println("Enter the MIN  MAX  and Rate for the " + (tier + 1) + " tier");
			System.out.println("Min Value - ");
			min[tier] = scanner.nextInt();
			System.out.println("Max Value - ");
			max[tier] = scanner.nextInt();
			System.out.println("Rate Value - ");
			fees[tier] = scanner.nextDouble();
			System.out.println("Successfully inserted values in the " + (tier + 1) + " tier");
			if (tier < noOfTiers - 1) {
				System.out.println("Do you want to add more tiers -(y/n)");
				char ch = scanner.next().charAt(0);
				if (ch == 'y')
					continue;
				else
					break;
			}
		}

		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		System.out.println("Successfully created Rate Card for service " + service.getServiceName());
//		values get setted to arrays in rate class of particular service

	}

	public static void displayServiceDetails(Service service) {
		// TODO Auto-generated method stub
		System.out.println("*******************SERVICE DETAILS**************************");
		System.out.println("Service Code " + "	" + " Service Name " + "	" + " Service Description " + "      "
				+ " Open Date " + "     " + " Validity Date " + "      " + "  Expiry Date ");
		System.out.println(service.getServiceCode() + "       " + service.getServiceName() + "      "
				+ service.getServiceDescription() + "      " + service.getOpenDate() + "       "
				+ service.getValidityDate() + "      " + service.getExpiryDate());

		System.out.println("***************Rate Card for the service " + service.getServiceName()
				+ " is displayed below*****************");
		System.out.println("MIN       MAX       Rate");
		for (int index = 0; index < service.getRate().getMin().length; index++) {
			if ((service.getRate().getMax()[index] <= 999999) && (service.getRate().getMax()[index] != 0)) {
				// incase if tier entered is 5 and only 3 tier values are entered there will be
				// 0 value in last 2 tiers. And till max value is to be printed
				System.out.println(service.getRate().getMin()[index] + "     " + service.getRate().getMax()[index]
						+ "      " + service.getRate().getRate()[index]);
			}
		}

	}

}
