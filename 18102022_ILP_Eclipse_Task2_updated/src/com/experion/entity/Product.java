package com.experion.entity;

import java.util.Date;

public class Product {

	private int serialNoOriginal;
	private String productCode;
	private String productName;
	private String productDescription;
	private double productPrice;
	private Date openDate;
	private Date validityDate;
	private Date expiryDate;
	private boolean active = false;
	private static int serialNo = 0;
	
	

	
	public Product(String productCode, String productName, String productDescription,
			double productPrice, Date openDate, Date validityDate, Date expiryDate) {
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
	}
	
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public Date getValidityDate() {
		return validityDate;
	}


	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public int getSerialNoOriginal() {
		return serialNoOriginal;
	}

	public void setSerialNoOriginal(int serialNoOriginal) {
		this.serialNoOriginal = serialNoOriginal;
	}
	

}
