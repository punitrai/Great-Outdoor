package com.cg.go.bean;

public class Product {

	private String productID;
	
	public String getProductID() {
		return productID;
	}

	public String setProductID(String productID) {
		return this.productID = productID;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + "]";
	}
	
	
}
