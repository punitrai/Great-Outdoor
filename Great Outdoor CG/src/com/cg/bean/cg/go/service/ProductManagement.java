package com.cg.go.service;

import com.cg.go.bean.ProductManagementSystem;

public interface ProductManagement {
public void AddProduct(ProductManagementSystem Product );
public boolean DeleteProduct(String ProductId);
public boolean EditProductcolor(ProductManagementSystem P, String ProductId);
public boolean EditProductprice(ProductManagementSystem P, String ProductId);
public boolean EditProductQuantity(ProductManagementSystem P, String ProductId);

}
