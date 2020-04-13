package com.cg.go.ui;

import java.util.Scanner;

import com.cg.go.bean.ProductManagementSystem;
import com.cg.go.bean.ProductMaster;
import com.cg.go.bean.UserDetails;
import com.cg.go.service.ProductManagementImplementation;
import com.cg.go.utilities.Utilities;

//import com.cg.go.bean.LoginDetails;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String defaultUser = "admin";
		String defaultPsw = "123";
		ProductManagementSystem P = new ProductManagementSystem();
		ProductManagementImplementation psi = new ProductManagementImplementation();
		ProductMaster pro = new ProductMaster();
		UserDetails usr = new UserDetails();

		while (true) {
			System.out.print("1. Admin Login\n" + "2. Retailer"+ "3. User");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:

				System.out.println("Enter your username");
				String username = sc.next();
				System.out.println("Enter your password");
				String password = sc.next();
				if (username.equals(username) && password.equals(password)) {
					System.out.println("welcome admin");
				} else {
					System.out.println("your password is not correct");
				}

				System.out.println("1. Add retailer/Product master" + "2. Logout");
				int opt1 = sc.nextInt();
				switch (opt1) {
				case 1:
					String mpassword, repassword;
					while (true) {
						System.out.println("Hey Product Master");
						System.out.println("Enter your username");
						String productUser = sc.next();
						boolean flag = Utilities.validateUserName(productUser);
						if (!flag) {
							System.out.println("Enter username correctly and size should be 6 to 14");
						} else {
							pro.setUsername(productUser);
							break;
						}

					}
					while (true) {
						System.out.println("Enter your password");
						mpassword = sc.next();
						boolean flag = Utilities.validatePassword(mpassword);
						if (!flag) {
							System.out.println("NOT VALID");
						} else {
							System.out.println("PERFECT");
							pro.setPassword(mpassword);
							break;
						}

					}
					while (true) {
						System.out.println("Re-enter your password");
						repassword = sc.next();
						if (repassword.equals(mpassword)) {
							System.out.println("PASSWORD MATCHED");
							break;
						} else {
							System.out.println("PASSWORD IS NOT MATCHED");
						}
					}
					while (true) {
						System.out.println("Enter your email id");
						String email = sc.next();
						boolean flag = Utilities.validateEmail(email);
						if (!flag) {
							System.out.println("Invalid");
						} else {
							System.out.println("prfect");
							pro.setEmail(email);
							break;
						}

					}
					while (true) {
						System.out.println("Enter your phone number");
						int phNum = sc.nextInt();
						boolean flag = Utilities.validatePhoneNumber(String.valueOf(phNum));
						if (!flag) {
							System.out.println("Invalid");
						} else {
							System.out.println("prfect");
							pro.setPhNum(String.valueOf(phNum));
							break;
						}

					}
					System.out.println(pro);
					break;
				case 2:
					System.out.println("Admin Logout");
					System.exit(1);
				default:
					System.out.println("choose appropriate value");
					break;
				}
				break;

			case 2:
			
				while (true) {
					
					System.out.println("welcome retailer to login");
					System.out.println("Enter your username ");
					String userId = sc.next();
					System.out.println("Enteryour password ");
					String userPsw = sc.next();
					if (userId.equals(pro.getUsername()) && userPsw.equals(pro.getPassword())) {
						System.out.println("---LOGGED IN---");
						break;
					} else {
						System.out.println("Invalid userID or PASSWORD");
					}
					System.out.println("Enter  1. TO ADD A PRODUCT " + "2. TO DELETE A PRODUCT " + "3. TO EDIT A PRODUCT "
							+ "4. Logout ");
					System.out.println("Enter the option");
					int option = sc.nextInt();
					switch (option) {
					case 1:
						while (true) {
							System.out.println("Enter the product Id");
							String ProductId = sc.next();
							boolean flag = Utilities.ProductIdValidate(ProductId);
							if (!flag) {
								System.out.println("Enter the Id as an Alphanumeric");
							} else
								P.setProductId(ProductId);
							break;

						}
						while (true) {
							System.out.println("Enter the product Name");
							String ProductName = sc.next();
							boolean flag = Utilities.NameValidate(ProductName);
							if (!flag)
								System.out.println("Enter the name in Alphabets");
							else
								P.setProductName(ProductName);
							break;

						}
						while (true) {
							System.out.println("Enter the product quantity");
							String quantity = sc.next();
							boolean flag = Utilities.QuantityValidate(quantity);
							if (!flag)
								System.out.println("Enter the quantity in numeric");
							else
								P.setQuantity(Integer.parseInt(quantity));
							break;

						}
						while (true) {
							System.out.println("Enter the product price");
							String Price = sc.next();
							boolean flag = Utilities.PriceValidate(Price);
							if (!flag)
								System.out.println("Enter the price in numeric");
							else
								P.setPrice(Double.parseDouble(Price));
							break;

						}
						while (true) {
							System.out.println("Enter the colour");
							String colour = sc.next();
							boolean flag = Utilities.ColourValidate(colour);
							if (!flag)
								System.out.println("Enter the colour in alphabets");
							else
								P.setColour(colour);
							break;

						}
						while (true) {
							System.out.println("Enter the manufacturer");
							String manufacturer = sc.next();
							boolean flag = Utilities.ManufactureValidate(manufacturer);
							if (!flag)
								System.out.println("Enter the Id as an Alphabets");
							else
								P.setManufacturer(manufacturer);
							break;

						}
						while (true) {
							System.out.println("Enter the product category");
							String ProductCategory = sc.next();
							boolean flag = Utilities.CategoryValidate(ProductCategory);
							if (!flag)
								System.out.println("Enter the category in numeric");
							else
								P.setProductCategory(Integer.parseInt(ProductCategory));
							break;

						}
						psi.AddProduct(P);
						System.out.println(P);
						break;
					case 2:
						System.out.println("Enter the Product ID to be deleted");
						String ProductId = sc.next();
						if (P.getProductId().equals(ProductId)) {
							psi.DeleteProduct(ProductId);
							System.out.println("The Product has been deleted successfully");
						} else {
							System.out.println("The productId do not match");
						}
						break;
					case 3:
						while (true) {
							System.out.println("Enter the Product ID to edit");
							String ProductId1 = sc.next();
							if (P.getProductId().equals(ProductId1)) {
								System.out.println("Enter the attribute you want to  edit " + "1. Colour " + "2. Price "
										+ "3.Quantity " + "4. Exit");
								int op = sc.nextInt();
								switch (op) {
								case 1:
									System.out.println("Enter the Colour");
									String colour = sc.next();
									P.setColour(colour);
									psi.EditProductcolor(P, ProductId1);
									System.out.println(P);
									break;
								case 2:
									System.out.println("Enter the Price");
									String Price = sc.next();
									P.setPrice(Double.parseDouble(Price));
									psi.EditProductprice(P, ProductId1);
									System.out.println(P);
									break;
								case 3:
									System.out.println("Enter the Quantity");
									String quantity = sc.next();
									P.setQuantity(Integer.parseInt(quantity));
									psi.EditProductQuantity(P, ProductId1);
									System.out.println(P);
									break;
								case 4:
									
									System.exit(0);
								default:
									System.out.println("Enter the appropriate option");
								}
							} else
								System.out.println("The product Id do not match");
							break;
						}

					case 4:
						System.out.println("----Logout----");
						System.exit(1);
					default:
						System.out.println("Enter the appropriate option");
					}
				}
				break;

			case 3:
				System.out.println("1. User Registration " + " 2. LogIn");
				int opt2 = sc.nextInt();
				switch (opt2) {
				case 1:
					String upassword, repassword;
					while (true) {
						System.out.println("Hello User");
						System.out.println("Enter your username");
						String userId = sc.next();
						boolean flag = Utilities.validateUserName(userId);
						if (!flag) {
							System.out.println("Enter username correctly and size should be 6 to 14");
						} else {
							pro.setUsername(userId);
							break;
						}
					}
					while (true) {
						System.out.println("Enter your password");
						upassword = sc.next();
						boolean flag = Utilities.validatePassword(upassword);
						if (!flag) {
							System.out.println("NOT VALID");
						} else {
							System.out.println("PERFECT");
							pro.setPassword(upassword);
							break;
						}
					}
					while (true) {
						System.out.println("Re-enter your password");
						repassword = sc.next();
						if (repassword.equals(upassword)) {
							System.out.println("PASSWORD MATCHED");
							break;
						} else {
							System.out.println("PASSWORD IS NOT MATCHED");
						}
					}
					while (true) {
						System.out.println("Enter your email id");
						String email = sc.next();
						boolean flag = Utilities.validateEmail(email);
						if (!flag) {
							System.out.println("Invalid");
						} else {
							System.out.println("prfect");
							pro.setEmail(email);
							break;
						}

					}
					while (true) {
						System.out.println("Enter your phone number");
						int phNum = sc.nextInt();
						boolean flag = Utilities.validatePhoneNumber(String.valueOf(phNum));
						if (!flag) {
							System.out.println("Invalid");
						} else {
							System.out.println("prfect");
							pro.setPhNum(String.valueOf(phNum));
							break;
						}
					}
					break;
				case 2:
					while (true) {
						System.out.println("welcome user to login");
						System.out.println("Enter your username ");
						String userId = sc.next();
						System.out.println("Enteryour password ");
						String userPsw = sc.next();
						if (userId.equals(usr.getUserId()) && userPsw.equals(usr.getPassword())) {
							System.out.println("---LOGGED IN---");
							break;
						} else {
							System.out.println("Invalid userID or PASSWORD");
						}
						System.out.println("1. Add item to cart" + "2. ");
						int opt4 = sc.nextInt();
						switch (opt4) {
						
						}
					}
				}

			default:
				System.out.println("choose value as given");
				break;

			}
		}
	}
}
