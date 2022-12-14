package com.ilpexperion.entity;

import com.ilpexperion.service.AccountCardServices;

public class Card extends Product implements AccountCardServices {

	private String cardNumber;
	private double cardBalance;
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getCardBalance() {
		return cardBalance;
	}

	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}

	@Override
	public void checkValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity Check of card...");

	}
	
	
	public void checkBalance() {
		System.out.println("Checking Card Balance...");
	}

	@Override
	public void checkWithdraw() {
		// TODO Auto-generated method stub
		System.out.println("Checking money withdrawed");
	}
	
}
