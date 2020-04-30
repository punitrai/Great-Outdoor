package com.cg.go.DAO;
import java.util.List;
import java.util.ArrayList;
import com.cg.go.bean.*;
public class ProductDAOImplementation implements ProductDAOInterface{
	
	List<Product> list = new ArrayList<Product>();
	Product p;

	@Override
	public void addProduct(Product product) 
	{
		
		list.add(product);
		
	}


	@Override
	public boolean deleteProduct(String productid) 
	{
		for(Product pr: list) {
			if(productid.equals(pr.getProductID()))
			{
			 list.remove(pr);
			 System.out.println(list.size());
		}
		
		 return true;
		 }	
	return false;
		
		//try krna
		
	}
	

}
