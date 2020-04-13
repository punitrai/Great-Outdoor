package com.cg.go.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Address;

public class AddressImplementationDAO implements AddressInterface
{
	private List<Address> addressList;
	public int size;
	
	public AddressImplementationDAO()
	{
		addressList = new ArrayList<>();
		size = 0;
	}

	@Override
	public void addAddress(String city, String state, String country)
	{
		addressList.add(new Address(city, state, country));
		size = addressList.size();
	}
	
	@Override
	public void updateCity(int index, String s)
	{
		addressList.get(index).setCity(s);
	}
	
	@Override
	public void updateState(int index, String s)
	{
		addressList.get(index).setState(s);
	}
	
	@Override
	public void updateCountry(int index, String s)
	{
		addressList.get(index).setCountry(s);
	}

	@Override
	public void deleteAddress(int index)
	{
		addressList.remove(index);
		size = addressList.size();
	}

	@Override
	public String viewAddress()
	{
		StringBuilder addressBuilder = new StringBuilder();
		for(int i=0;i<size;i++)
		{
			Address a = addressList.get(i);
			addressBuilder.append(i+1+". "+a.getCity()+", "+a.getState()+", "+a.getCountry()+"\n");
		}
		return addressBuilder.toString();
	}
}