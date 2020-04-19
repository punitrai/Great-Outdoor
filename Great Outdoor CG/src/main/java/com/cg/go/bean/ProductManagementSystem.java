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

	public String setProductId(String productId) {
		return this.ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public String setProductName(String productName) {
		return this.ProductName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int setQuantity(int quantity) {
		return this.quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public Double setPrice(double price) {
		return this.Price = price;
	}

	public String getColour() {
		return colour;
	}

	public String setColour(String colour) {
		return this.colour = colour;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String setManufacturer(String manufacturer) {
		return this.manufacturer = manufacturer;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public int setProductCategory(int productCategory) {
		return this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "ProductManagementSystem [ProductId=" + ProductId + ", ProductName=" + ProductName + ", quantity="
				+ quantity + ", Price=" + Price + ", colour=" + colour + ", manufacturer=" + manufacturer
				+ ", productCategory=" + productCategory + "]";
	}

}
