package com.cg.go.DAO;

import com.cg.go.bean.Product;

public interface ProductDAOInterface {

	public void addProduct(Product product);
	public boolean deleteProduct(String productID); 
}
