package com.cg.go.Validator;
import com.cg.go.exception.*;
public class RetailerValidator {

	public static void IsValidUserID(String userid) throws IsValidUserID
	{
		String pattern = "^[a-zA-Z] {1}[a-zA-Z_.\\d]{2,8}";
		if(!userid.matches(pattern)) 
			throw new IsValidUserID("Only Alphanumeric value");
		
	}
	
	

		public static void IsValidPassword(String password) throws IsValidPassword
		{
			String pattern = "((?=.^[a-zA-Z])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%])).{8,20}$";
			if(!password.matches(pattern)) 
				throw new IsValidPassword("Strong password please");
			
		}
}
