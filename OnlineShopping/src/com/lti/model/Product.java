package com.lti.model;

public class Product {

	private int productId;
	private int productName;
	private int productDesc;
	private int productQuant;
	private double price;
	
	public Product() {
		
	}
	public double getPrice() {
		return price;	
	}
	public int getProductQuant() {
		return productQuant;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductName() {
		return productName;
	}
	public void setProductName(int productName) {
		this.productName = productName;
	}
	public int getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(int productDesc) {
		this.productDesc = productDesc;
	}
	
}
