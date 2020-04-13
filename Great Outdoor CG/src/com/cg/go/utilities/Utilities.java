package com.cg.go.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
	public static boolean validateEmail(String mtch) {
		// String
		// pattern="^([a-zA-Z_0-9]{2,18}+)@([a-zA-Z_0-9]{2,17}+).([a-zA-Z]{1,5})$";
		Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher mtch1 = regex.matcher(mtch);
		if (mtch1.matches())
			return true;
		return false;
	}

	public static boolean validateUserName(String userName) {
		String pattern = "^[a-zA-Z0-9_-]{6,14}$";
		if (userName.matches(pattern)) {
			return true;
		}
		return false;
	}

	public static boolean validatePassword(String password) {
		String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

		if (password.matches(pattern)) {
			System.out.println("matched");
			return true;
		}
		return false;
	}

	public static boolean validatePhoneNumber(String phNum) {
		String pattern = "[0-9]{5,7}";
		if (phNum.matches(pattern))
			return true;
		return false;
	}

	public static boolean ProductIdValidate(String ProductId) {
		String pattern = "[a-zA-Z]{1,10}";
		if (ProductId.matches(pattern)) {
			return true;
		}

		return false;
	}

	public static boolean NameValidate(String ProductName) {
		String pattern = "[a-zA-Z]{4,20}";
		if (ProductName.matches(pattern)) {
			return true;
		} else
			return false;
	}

	public static boolean QuantityValidate(String quantity) {
		String pattern = "[0-9]{1,3}";
		if (quantity.matches(pattern)) {
			return true;
		} else
			return false;
	}

	public static boolean PriceValidate(String Price) {
		String pattern = "[0-9]{2,5}";
		if (Price.matches(pattern)) {
			return true;
		} else
			return false;
	}

	public static boolean ColourValidate(String colour) {
		String pattern = "[a-zA-Z]{3,10}";
		if (colour.matches(pattern)) {
			return true;
		} else
			return false;
	}

	public static boolean ManufactureValidate(String manufacturer) {
		String pattern = "[a-zA-z]{3-15}";
		if (manufacturer.matches(pattern)) {
			return true;
		} else
			return false;
	}

	public static boolean CategoryValidate(String ProductCategory) {
		String pattern = "[0-9]{1}";
		if (ProductCategory.matches(pattern)) {
			return true;
		} else
			return false;
	}
	public static boolean ValidateCity(String city)
	{
		String pattern = "[a-z A-Z]{1,10}";
		if(city.matches(pattern))
			 return true;
		return false;
	}
	
	public static boolean ValidateState(String state)
	{
	 String	 pattern = "[a-zA-Z]{1,10}";
		 if(state.matches(pattern))
			 return true;
		return false;
	}
	
	public static boolean ValidateCountry(String country)
	{
	String pattern = "[a-zA-Z]{1,10}";
		 if(country.matches(pattern))
			 return true;
		return false;
	}
}
