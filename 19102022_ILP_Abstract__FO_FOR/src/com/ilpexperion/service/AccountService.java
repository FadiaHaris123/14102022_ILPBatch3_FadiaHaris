package com.ilpexperion.service;

import com.ilpexperion.entity.Account;

public class AccountService {

	public void depositCash(Account account,double amount) {
		System.out.println("Deposit money over counters");
	}
	public void depositCash(Account account,String chequeNumber,double amount) {
		System.out.println("Deposit money via cheque");
	}
	public void depositCash(Account account,double amount,String upicode) {
		System.out.println("Deposit money via transfer");
	}
}
