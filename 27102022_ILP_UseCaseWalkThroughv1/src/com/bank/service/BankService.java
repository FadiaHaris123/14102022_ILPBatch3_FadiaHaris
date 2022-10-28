package com.bank.service;

import java.util.Date;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {

	public static Service createService() {

		Service service = new Service("SCD100", "Cash Deposit", "Cash Deposit desc", new Date(2022, 10, 27),
				new Date(2023, 10, 27), new Date(2024, 10, 27));
		System.out.println(service);
		return service;
	}

	public static void createRateCard(Service service) {

		Rate rate = new Rate();
		int[] min = new int[3];
		int[] max = new int[3];
		double[] fees = new double[3];

		min[0] = 0;
		min[1] = 2000;
		min[2] = 5000;

		max[0] = 2000;
		max[1] = 5000;
		max[2] = 999999;

		fees[0] = 0.25;
		fees[1] = 0.5;
		fees[2] = 0.1;
		
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);   
//		values get setted to arrays in rate class of particular servuce

	}

	public static void displayServiceDetails(Service service) {
		// TODO Auto-generated method stub
		
		System.out.println(service);
		System.out.println(service.getRate());
	}

}
