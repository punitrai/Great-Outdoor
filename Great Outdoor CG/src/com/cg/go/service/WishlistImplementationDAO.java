package com.cg.go.service;
import java.util.List;
import java.util.ArrayList;
import com.bean.Wishlist;

public class WishlistImplementationDAO implements WishlistInterface {

	List<Wishlist> list = new ArrayList<>();
	
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
