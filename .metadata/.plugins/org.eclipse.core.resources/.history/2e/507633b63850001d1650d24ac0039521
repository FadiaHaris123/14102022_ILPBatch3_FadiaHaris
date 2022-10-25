package com.ilpexperion.utility;

import java.util.Scanner;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.Card;
import com.ilpexperion.entity.Loan;
import com.ilpexperion.entity.Product;
import com.ilpexperion.service.AccountService;

public class BankUtility {

	public static void main(String[] args) {

		// Compile Time Polymorphism

//		Account account = new Account("Savings Account","Acc1001",10000);
//		AccountService accountService = new AccountService();
//		accountService.depositCash(account,10000);
//		accountService.depositCash(account,0,"asdfghjkl");
//		accountService.depositCash(account,"sdfghj",0);

		Product product = null; // created a reference variable for product class
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if (choice == 1) {
			product = new Account("Savings Account", "Acc1001", 10000); // created an object of account and referenced
																		// using parent reference variable
			Account account = (Account) product; // type casting is required because parent reference variable cant
													// point abstract function implemented in child
			account.checkBalance();
			account.checkWithdraw();
		} else if (choice == 2) {
			product = new Card("Master Card", "card1001", 10000);
			Card card = (Card) product;
			card.checkBalance();
			card.checkWithdraw();
		} else if (choice == 3) {
			product = new Loan("House Loan", "ln1001", 10000);
			Loan loan = (Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
		}

		// Depending on the choice only checkvalidity function is called thus runtime
		// overriding
	}
}
