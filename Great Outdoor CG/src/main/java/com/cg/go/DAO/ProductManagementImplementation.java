package com.cg.go.DAO;

import java.util.ArrayList;



import com.cg.go.bean.ProductManagementSystem;
import com.cg.go.DAO.ProductManagementDAO;

public class ProductManagementImplementation implements ProductManagementDAO{
    
	ArrayList<ProductManagementSystem> ProSys= new ArrayList<ProductManagementSystem>();
	
	@Override
	public void AddProduct(ProductManagementSystem Product) {
		ProSys.add(Product);
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean DeleteProduct(String ProductId) {
		if(ProductId.equals(ProductId)) {
		ProSys.remove(ProductId);
			return true;
		}
		else
          return false;
	}

	@Override
	public boolean EditProductcolor(ProductManagementSystem P, String ProductId) {
	    if(ProductId.equals(ProductId)) {
	    	P.setColour(P.getColour());
	        return true;
	    }
	    else
		return false;
	}

	@Override
	public boolean EditProductprice(ProductManagementSystem P, String ProductId) {
		  if(ProductId.equals(ProductId)) {
			  P.setPrice(P.getPrice());
			  return true;
		  }
		return false;
	}

	@Override
	public boolean EditProductQuantity(ProductManagementSystem P, String ProductId) {
		if(ProductId.equals(ProductId)) {
			P.setQuantity(P.getQuantity());
			return true;
		}
		return false;
	}
	

}
