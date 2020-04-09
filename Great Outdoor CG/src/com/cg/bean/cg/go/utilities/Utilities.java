package com.cg.go.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
	public static boolean validateEmail(String email) {
	String pattern="^([a-zA-Z_0-9]{2,8}+)@([a-zA-Z]{2,7}+).([a-zA-Z]{3})$";
	if(pattern.matches(email))
		return true;
	return false;
}
	private static Pattern userNamePattern = Pattern.compile("^[a-zA-Z0-9_-]{6,14}$");

	public static boolean validateUserName(String userName) {
//		String pattern="^[a-zA-Z0-9_-]{6,14}$";
		Matcher mtch = userNamePattern.matcher(userName);
		if(mtch.matches()) {
			return true;
		}
		return false;
	}
//	private static Pattern password = Pattern.compile("^[a-zA-Z0-9_-]{6,14}$");
	public static boolean validatePassword(String password) {
		String pattern="((?=.*[a-z])(?=.*\\\\d)(?=.*[A-Z]).{8,40})";
//		Matcher mtch = userNamePattern.matcher(password);
		if(pattern.matches(password))
			return true;
		return false;
	}
	
	public static boolean ProductIdValidate(String ProductId) {
		String pattern="[a-zA-Z]{1,10}";
		if(pattern.matches(ProductId)) {
			return true;
			}
		
		return false;
	}
	public static boolean NameValidate(String ProductName) {
		String pattern="[a-zA-Z]{4,20}";
		if(pattern.matches(ProductName)) {
			return true;}
		else
			return false;
		}
	public static boolean QuantityValidate(String quantity) {
		String pattern="[0-9]{1,3}";
		if(pattern.matches(quantity)) {
			return true;}
		else
			return false;
		}
	public static boolean PriceValidate(String Price) {
		String pattern="[0-9]{2,5}";
		if(pattern.matches(Price)) {
			return true;}
		else
			return false;
		}
	public static boolean ColourValidate(String colour) {
		String pattern="[a-zA-Z]{3,10}";
		if(pattern.matches(colour)) {
			return true;}
		else
			return false;
		}
	public static boolean ManufactureValidate(String manufacturer) {
		String pattern="[a-zA-z]{3-15}";
		if(pattern.matches(manufacturer)) {
			return true;}
		else
			return false;
		}
	public static boolean CategoryValidate(String ProductCategory) {
		String pattern="[0-9]{1}";
		if(pattern.matches(ProductCategory)) {
			return true;}
		else
			return false;
		}
	
}
//(?=.*[@#$%!])