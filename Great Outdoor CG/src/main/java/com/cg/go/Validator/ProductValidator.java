package com.cg.go.Validator;

import com.cg.go.exception.IsvalidProductId;

public class ProductValidator {

	public static void IsValidProuctId(String productId ) throws IsvalidProductId 
	{
		String pattern ="[a-zA-Z]{1}[0-9]{2,10}";
		if(! productId.matches(pattern)) 
		{
			throw new IsvalidProductId("Alphanumeric value only");
		}
		
	}

	
}