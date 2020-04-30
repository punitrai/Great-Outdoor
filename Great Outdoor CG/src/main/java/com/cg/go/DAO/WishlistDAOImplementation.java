package com.cg.go.DAO;
import java.util.List;

import java.util.ArrayList;
import com.cg.go.bean.Wishlist;

public class WishlistDAOImplementation implements WishlistDAOInterface {

	List<Wishlist> list = new ArrayList<Wishlist>();
	
	@Override
	public void addWishList(String product) 
	{
		list.add(new Wishlist(product));
	
	}

	@Override
	public String viewWishList() 
	{
		int i; Wishlist w;  
		StringBuilder sb = new StringBuilder();
		
		for( i=0; i<list.size(); i++) 
		{
		
			w = list.get(i);
			sb.append((i+1)+" "+w.getProduct()+"\n");
		}
		return sb.toString();
	}

}
