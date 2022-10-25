package com.ilpexperion.entity;

public class Loan extends Product {

	private String loanNumber;
	private double loanAccount;
	
	public Loan(String productName, String loanNumber, double loanAccount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAccount = loanAccount;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(double loanAccount) {
		this.loanAccount = loanAccount;
	}

	@Override  //annotation
	public void checkValidity() {
		System.out.println("Validity Check of Loan class called..");
		
	}
	
	
}
