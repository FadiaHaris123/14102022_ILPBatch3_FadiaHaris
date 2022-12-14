package com.ilpexperion.service;

import java.util.ArrayList;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.BankServices;
import com.ilpexperion.entity.Card;
import com.ilpexperion.entity.Product;

public class Service {

	public static Product createProduct(String productType) { // returns a product(card/account) object

		ArrayList<BankServices> bankServicesList = new ArrayList<BankServices>();
		bankServicesList.add(new BankServices("101", "Online Banking")); // List takes in new objects of bankservices
		bankServicesList.add(new BankServices("102", "Online Banking"));
		bankServicesList.add(new BankServices("103", "Online Banking"));

		BankServices cardBankServices = new BankServices("BS101", "Generate Pin");

		Product product = null;
		if (productType.compareTo("Cards") == 0) {
			// Card card = new Card("MC100","Master Card","Cards","Master");
			product = new Card("MC100", "Master Card", "Cards", "Master", cardBankServices); // goes to card constructor
		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("HDFC100", "Woman Savings Account", "Accounts", "Savings", bankServicesList); // goes
																												// to
			// account
			// constructor
		}
		return product;
	}

	public static void displayProduct(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		Card card = null;
		Account account = null;
		System.out.println("Product Code:" + "\t" + "Product Name " + "\t\t" + "Product Type" + "\t\t"
				+ "Accountt/Card Type" + "    ");
		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product; // if product is instance of card then cast to card type and refer the member
										// function of Card class
				System.out.println(card.getProductCode() + "            " + card.getProductName() + "          "
						+ card.getProductType() + "          " + card.getCardType() + "         "
						+ card.getCardBankServices().getServiceName());
			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(account.getProductCode() + "          " + account.getProductName() + "          "
						+ account.getProductType() + "           " + account.getAccountType() + "         ");
				System.out.println("Following are the bank services : ");
				for (BankServices bankServices : account.getBankServicesList()) {
					System.out.println(bankServices.getServiceName());
				}
				// account.getBankServices() returns object
				// bankServices using which bankservice name can
				// be obtained
			}
		}
	}

}
