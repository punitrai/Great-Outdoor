package com.cg.go.DAO;

public interface AddressDAO
{
	public void addAddress(String city, String state, String country);
	public void updateCity(int pos, String value);
	public void updateState(int pos, String value);
	public void updateCountry(int pos, String value);
	public void deleteAddress(int pos);
	public String viewAddress();
}
