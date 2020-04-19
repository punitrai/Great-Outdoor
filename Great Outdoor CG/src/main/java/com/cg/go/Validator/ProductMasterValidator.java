package com.cg.go.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.go.bean.ProductMaster;
import com.cg.go.exception.Isvalidemail;
import com.cg.go.exception.Isvalidphone;
import com.cg.go.exception.Isvalidpwd;
import com.cg.go.exception.Isvaliduname;

public class ProductMasterValidator {
	public void Validate(ProductMaster p) throws Exception{
		Isvaliduname(String.valueOf(p.getUsername()));
		Isvalidpwd(String.valueOf(p.getPassword()));
		Isvalidphone(String.valueOf(p.getPhNum()));
		Isvalidemail(String.valueOf(p.getEmail()));
		
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
	
}
