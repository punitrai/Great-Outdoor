package com.cg.go.Validator;
import com.cg.go.exception.*;
public class AddressValidator
{
	public static void IsValidCity(String city) throws IsValidCity
	{
		String pattern = "[a-z A-Z]{1,20}";
		if(!city.matches(pattern))
		{
			throw new  IsValidCity("City should be in Alphabets");
		}
	}
	
	public static void IsValidState(String state) throws IsValidState
	{
	 String	 pattern = "[a-zA-Z\\s]{1,20}";
		 if(!state.matches(pattern))
		 {
				throw new  IsValidState("State should be in Alphabets ");
			}
	}
	
	public static void IsValidCountry(String country) throws IsValidCountry
	{
	String pattern = "[a-zA-Z]{1,20}";
		 if(!country.matches(pattern))
		 {
				throw new  IsValidCountry("Country should be in Alphabets");
			}
	}
}