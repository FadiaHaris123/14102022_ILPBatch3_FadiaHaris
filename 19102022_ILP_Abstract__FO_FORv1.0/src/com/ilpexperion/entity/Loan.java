package com.ilpexperion.entity;

import com.ilpexperion.service.LoanServices;

public class Loan extends Product implements LoanServices{

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
	
	public void checkDueDate(){
		System.out.println("Checking Due Date");
	}
	
	public void loanApproval(){
		System.out.println("Displaying loan approved or not");
	}
	
	
}
