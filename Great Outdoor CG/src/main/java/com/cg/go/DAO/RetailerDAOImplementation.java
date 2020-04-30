package com.cg.go.DAO;
import java.util.ArrayList;
import java.util.List;
import com.cg.go.bean.Retailer;

public class RetailerDAOImplementation implements RetailerDAOInterface{

	private List <Retailer> list;
	Retailer retailer;
	
	public RetailerDAOImplementation()
	{
		list = new ArrayList<Retailer>();
		list.add(new Retailer("Retailer","12345678") );
	}
	
	@Override
	public boolean userId(String userid) 
	{	
		if(userid.equals(retailer.getUserid()))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean password(String password) 
	{
		
		if(password.equals(retailer.getPassword()))
			return true;
		return false;
	}
	

}
