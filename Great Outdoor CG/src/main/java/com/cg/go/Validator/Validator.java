package com.cg.go.Validator;

import java.util.regex.Matcher;
import com.cg.go.exception.*;

import java.util.regex.Pattern;
import com.cg.go.bean.*;

public class Validator {
	
	public void Validate(ProductManagementSystem p) throws Exception {
		Isvalidproductname(String.valueOf(p.getProductName()));
		IsvalidProductId(String.valueOf(p.getProductId()));
		IsvalidQuan(String.valueOf(p.getQuantity()));
		Isvalidprice(String.valueOf(p.getPrice()));
		Isvalidcolor(String.valueOf(p.getColour()));
		Isvalidmanuftr(String.valueOf(p.getManufacturer()));
		IsvalidCategory(String.valueOf(p.getProductCategory()));
	}
	public void Validate(UserDetails u) throws Exception{
		Isvaliduname(String.valueOf(u.getUserId()));
		Isvalidpwd(String.valueOf(u.getPassword()));
		Isvalidphone(String.valueOf(u.getPhNum()));
		Isvalidemail(String.valueOf(u.getEmail()));
	}
	
	public static void Isvalidemail(String mtch) throws Isvalidemail{
		
		Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher mtch1 = regex.matcher(mtch);
		if (!mtch1.matches()) {
			throw new Isvalidemail("Email should be in the right format!");
		}
			
	}

	public static void Isvaliduname(String userName) throws Isvaliduname {
		String pattern = "^[a-zA-Z0-9_-]{6,14}$";
		if (!userName.matches(pattern)) {
			throw new Isvaliduname("User name should be in correct format");
	}
	}
	public static void Isvalidpwd(String password) throws Isvalidpwd{
		String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

		if (!password.matches(pattern)) {
			throw new Isvalidpwd("Password should be in correct format");
		}
		
	}

	public static void Isvalidphone(String phNum) throws Isvalidphone {
		String pattern = "[0-9]{10,11}";
		if (!phNum.matches(pattern)) {
			throw new Isvalidphone("Phone number should be in numeric");
		}
		
	}
	

	public static void IsvalidProductId(String ProductId) throws IsvalidProductId {
		String pattern = "[a-zA-Z]{1}[0-9]{2,10}";
		if (!ProductId.matches(pattern)) {
			throw new IsvalidProductId("Product ID should be Alpha Numeric");
		}
	}

	public static void Isvalidproductname(String ProductName) throws Isvalidproductname{
		String pattern = "[a-zA-Z]{4,20}";
		if (!ProductName.matches(pattern)) {
			throw new Isvalidproductname("Product name should be Alphabets");
		}
	}

	public static void IsvalidQuan(String quantity) throws IsvalidQuan {
		String pattern = "[0-9]{1,3}";
		if (!quantity.matches(pattern)) {

			throw new IsvalidQuan("Quantity should be Numeric");
		}
	}

	public static void Isvalidprice(String Price) throws Isvalidprice{
		String pattern = "[0-9]{2,5}";
		if (!Price.matches(pattern)) {

			throw new Isvalidprice("Price should be Numeric");
		}
	}

	public static void Isvalidcolor(String colour) throws Isvalidcolor {
		String pattern = "[a-zA-Z]{3,10}";
		if (!colour.matches(pattern)) {

			throw new Isvalidcolor("Color should be Alphabets");
		}
	}

	public static void Isvalidmanuftr(String manufacturer) throws Isvalidmanuftr {
		String pattern = "^[a-zA-z]{3,15}$";
		if (!manufacturer.matches(pattern)) {

			throw new Isvalidmanuftr("Manufacturer should be Alphabets");
		}
	}

	public static void IsvalidCategory(String ProductCategory) throws IsvalidCategory {
		String pattern = "[0-9]{1}";
		if (!ProductCategory.matches(pattern)) {

			throw new IsvalidCategory("Category should be Numeric");
		}
	}
	
}
