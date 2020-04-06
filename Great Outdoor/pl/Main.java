	package com.cg.go.pl;
	
	import java.util.Scanner;

import com.cg.go.bean.ProductMaster;
import com.cg.go.utilities.Utilities;
	
	//import com.cg.go.bean.LoginDetails;
	
	public class Main {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String defaultUser="admin";
		String defaultPsw="123";
		while(true) {
		
			ProductMaster pro=new ProductMaster();
		System.out.print("1. Admin Login\n"+"2. User" );
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			
			System.out.println("Enter your username");
			String username=sc.next();
			System.out.println("Enter your password");
			String password=sc.next();
			if(username.equals(username) && password.equals(password)) {
				System.out.println("welcome admin");
			}
			else {
				System.out.println("your password is not correct");
			}
			
			System.out.println("1. Add retailer/Product master"+"2. Logout");
			int opt1=sc.nextInt();
			switch (opt1) {
			case 1:
				while(true) {
				System.out.println("Hey Product Master");
				System.out.println("Enter your username");
				String productUser=sc.next();
				boolean flag = Utilities.validateUserName(productUser);
				if(!flag)
				{
					System.out.println("Enter username correctly and size should be 6to14");
				}
				else {
					break;
				}
				pro.setUsername(productUser);
				}
				while(true) {
				System.out.println("Enter your password");
				String mpassword=sc.next();
				
				boolean flag = Utilities.validateUserName(mpassword);
//				System.out.println("ghh");
				if(!flag)
				{
					System.out.println("enter password correctly");
				}
				else {
					System.out.println("prfect");
					break;
				}
				pro.setPassword(mpassword);
				
				System.out.println("Re-enter your password");
				String repassword=sc.next();
				if(mpassword.equals(repassword)) {
					System.out.println("Perfect");
				}
				else {
					System.out.println("Please enter the password as enter above");
				}}
				break;
			case 2:
				System.exit(1);
			default:
				System.out.println("choose appropriate value");
				break;
			}
		default:
			System.out.println("choose value as given");
			break;
			
		}
	}
}
}

