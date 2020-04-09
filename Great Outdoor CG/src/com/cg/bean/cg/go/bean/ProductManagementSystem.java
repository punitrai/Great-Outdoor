package com.cg.go.bean;

public class ProductManagementSystem {
	private String ProductId;
	private String ProductName;
	private int quantity;
	private double Price;
	private String colour;
	private String manufacturer;
	private int productCategory;
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "ProductManagementSystem [ProductId=" + ProductId + ", ProductName=" + ProductName + ", quantity="
				+ quantity + ", Price=" + Price + ", colour=" + colour + ", manufacturer=" + manufacturer
				+ ", productCategory=" + productCategory + "]";
	}
	
	

}
