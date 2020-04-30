package com.cg.go.ui;

import java.util.Scanner;
import com.cg.go.bean.*;
import com.cg.go.exception.*;
import com.cg.go.service.CancelManagementSysIMPl;
import com.cg.go.service.PlacingOrderServiceImpl;
import com.cg.go.DAO.*;
import com.cg.go.Validator.*;

public class MainCall {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ProductManagementSystem P = new ProductManagementSystem();
	ProductManagementImplementation psi = new ProductManagementImplementation();
	PlacingOrderServiceImpl posi = new PlacingOrderServiceImpl();
	CancelManagementSysIMPl cms = new CancelManagementSysIMPl();
	AddressDAOImplementation ai = new AddressDAOImplementation();
	Product product = new Product();
	ProductDAOImplementation pi = new ProductDAOImplementation();
	WishlistDAOImplementation wi = new WishlistDAOImplementation();
	ProductMaster pro = new ProductMaster();
	UserDetails usr = new UserDetails();
	while(true) {
	System.out.print("1. Admin Login\n" + "2. Product Master\n" + "3. Retailer\n" + "4. User Registration\n" + "5. User Login ");
	int opt = sc.nextInt();
	switch (opt) {
	case 1:
		while (true) {
			System.out.println("Enter your username");
			String username = sc.next();
			System.out.println("Enter your password");
			String password = sc.next();
			if (username.equals("admin123") && password.equals("qwerty@1A")) {
				System.out.println("Welcome Admin");
				break;
			} else {
				System.out.println("ERROR : Your username or password is incorrect");
			}
		}
		System.out.println("1. Add Product master\n" + "2. Logout");
		int opt1 = sc.nextInt();
		switch (opt1) {
		case 1:
			String mpassword, repassword, email, phNum, productUser;
			while (true) {
				System.out.println("Enter your Details");
				System.out.println("Enter your username");
				productUser = sc.next();
				try {
					ProductMasterValidator.Isvaliduname(productUser);
					break;
				} catch (Isvaliduname e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter your password");
				mpassword = sc.next();
				try {
					ProductMasterValidator.Isvalidpwd(mpassword);
					break;
				} catch (Isvalidpwd e) {
					System.out.println(e);
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
				email = sc.next();
				try {
					ProductMasterValidator.Isvalidemail(email);
					break;
				} catch (Isvalidemail e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter your phone number");
				phNum = sc.next();
				try {
					ProductMasterValidator.Isvalidphone(phNum);
					break;
				} catch (Isvalidphone e) {
					System.out.println(e);
				}
			}
			pro.setUsername(productUser);
			pro.setPassword(mpassword);
			pro.setEmail(email);				
			pro.setPhNum(Long.parseLong(phNum));

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

			System.out.println("Welcome Product Master to Login");
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
			}
		System.out.println("Enter  1. TO ADD A PRODUCT " + "2. TO DELETE A PRODUCT " + "3. TO EDIT A PRODUCT "
				+ "4. TO EXIT ");
		System.out.println("Enter the option");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			String ProductId, ProductName, quantity, Price, colour, manufacturer, ProductCategory;
			while (true) {
				System.out.println("Enter the product Id");
				ProductId = sc.next();
				try {
					Validator.IsvalidProductId(ProductId);
					break;
				} catch (IsvalidProductId e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter the product Name");
				ProductName = sc.next();
				try {
					Validator.Isvalidproductname(ProductName);
					break;
				} catch (Isvalidproductname e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter the product quantity");
				quantity = sc.next();
				try {
					Validator.IsvalidQuan(quantity);
					break;
				} catch (IsvalidQuan e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter the product price");
				Price = sc.next();
				try {
					Validator.Isvalidprice(Price);
					break;
				} catch (Isvalidprice e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter the colour");
				colour = sc.next();
				try {
					Validator.Isvalidcolor(colour);
					break;
				} catch (Isvalidcolor e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter the manufacturer");
				manufacturer = sc.next();
				try {
					Validator.Isvalidmanuftr(manufacturer);
					break;
				} catch (Isvalidmanuftr e) {
					System.out.println(e);
				}

			}
			while (true) {
				System.out.println("Enter the product category");
				ProductCategory = sc.next();
				try {
					Validator.IsvalidCategory(ProductCategory);
					break;
				} catch (IsvalidCategory e) {
					System.out.println(e);

				}

			}
			P.setProductId(ProductId);
			P.setProductName(ProductName);
			P.setQuantity(Integer.parseInt(quantity));
			P.setPrice(Double.parseDouble(Price));
			P.setColour(colour);
			P.setManufacturer(manufacturer);
			P.setProductCategory(Integer.parseInt(ProductCategory));
			psi.AddProduct(P);
			System.out.println(P);
			break;

		case 2:
			System.out.println("Enter the Product ID to be deleted");
			ProductId = sc.next();
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
						colour = sc.next();
						P.setColour(colour);
						psi.EditProductcolor(P, ProductId1);
						System.out.println(P);
						break;
					case 2:
						System.out.println("Enter the Price");
						Price = sc.next();
						P.setPrice(Double.parseDouble(Price));
						psi.EditProductprice(P, ProductId1);
						System.out.println(P);
						break;
					case 3:
						System.out.println("Enter the Quantity");
						quantity = sc.next();
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
			System.exit(0);
		default:
			System.out.println("Enter the appropriate option");
		}
	case 3:
		while (true) {
			String retailerId,retailerPsw;
			System.out.println("Welcome Retailer to Login");
			System.out.println("Enter your username ");
			retailerId = sc.next();
			System.out.println("Enteryour password ");
			retailerPsw = sc.next();
			if (retailerId.equals("retailer123") && retailerPsw.equals("Qwerty123@")) {
				System.out.println("---LOGGED IN---");
				break;

			} else {
				System.out.println("Invalid userID or PASSWORD");
			}
			}

		int choice;
		
		while (true) {
			System.out.println("\nPress 0 to exit.");
			System.out.println("1. Add Addresss :\n2. Update Adress :\n3. Delete Address :\n4. View Address :\n5. Add an item to the cart :\n6. Delete an item from the cart :\n7. Add product to the wishlist :\n8. View wishlist :\n");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("Bye");
				break;
			}

			switch (choice) {
			case 1: {
				String city;
				String state;
				String country;

				while (true) {
					System.out.print("\nEnter the name of city: ");
					city = sc.nextLine();
					try {
						AddressValidator.IsValidCity(city);
						break;
					} catch (IsValidCity e) {
						System.out.println(e);
					}

				}

				while (true) {
					System.out.print("Enter the name of state: ");
					state = sc.nextLine();
					try {
						AddressValidator.IsValidState(state);
						break;
					} catch (IsValidState e) {
						System.out.println(e);
					}

				}

				System.out.print("Enter the name of country: ");
				while (true) {
					country = sc.nextLine();
					try {
						AddressValidator.IsValidCountry(country);

						break;
					} catch (IsValidCountry e) {
						System.out.println(e);
					}

				}
				ai.addAddress(city, state, country);
				break;
			}
			case 2: {
				System.out.println();
				ai.viewAddress();
				System.out.println("Index of address to update: [Please Enter 1 ] ");
				int index = Integer.parseInt(sc.nextLine());
				if (index < 1 || index > ai.size) {
					System.out.println("Invalid index!!");
					break;
				}
				System.out.print("1.To update city name\n2.To upadte state name\n3.To update country name\n");
				int ch = Integer.parseInt(sc.nextLine());
				switch (ch) {
				case 1:
					System.out.print("City: ");
					String city;
					while (true) {
						city = sc.nextLine();
						try {
							AddressValidator.IsValidCity(city);
							break;
						} catch (IsValidCity e) {
							System.out.println(e);
						}

					}

					ai.updateCity(index - 1, city);
					break;
				case 2:
					System.out.print("State: ");
					String state;
					while (true) {
						state = sc.nextLine();
						try {
							AddressValidator.IsValidState(state);
							break;
						} catch (IsValidState e) {
							System.out.println(e);
						}

					}

					ai.updateState(index - 1, state);
					break;
				case 3:
					System.out.print("Country: ");
					String country;
					while (true) {
						country = sc.nextLine();
						try {
							AddressValidator.IsValidCountry(country);

							break;
						} catch (IsValidCountry e) {
							System.out.println(e);
						}

					}

					ai.updateCountry(index - 1, country);
					break;
				default:
					System.out.println("Wrong choice");
				}
				break;
			}
			case 3: {
				System.out.println();
				ai.viewAddress();
				System.out.print("Index of address to delete: ");
				int index = Integer.parseInt(sc.nextLine());
				if (index < 1 || index > ai.size) {
					System.out.println("Invalid index!!");
				} else {
					ai.deleteAddress(index - 1);
					System.out.println("Address deleted.");
				}
				break;
			}
			case 4:
				System.out.println();
				if (ai.size == 0) {
					System.out.println("No address present!!");
				} else {
					System.out.println("Addresses:-");
					System.out.println(ai.viewAddress());
				}
				break;
			default:
				System.out.println("Wrong choice !!");

			case 5: 
					String ProductId;
					while (true) 
					{
						System.out.println("Enter the product Id");
						ProductId = sc.next();
						try 
						{
							Validator.IsvalidProductId(ProductId);
							product.setProductID(ProductId);
							
							pi.addProduct(product);
							break;
						}	 
						catch (IsvalidProductId e) 
						{
							System.out.println(e);
						}
					
				}
				
				break;

			case 6: 
				while(true) {
					System.out.println("Enter the Product ID to be deleted");		
					String productId = sc.next();
				try 
					{
						Validator.IsvalidProductId(productId);
						if (productId.equals(product.getProductID())) 
						{
							pi.deleteProduct(productId);
							System.out.println("The Product has been deleted successfully");
							System.out.println("This product has been removed "+product);
							
							break;
						} 
						else {
						System.out.println("The product Id do not match");
						}
						
					} 
					catch (IsvalidProductId e) 
					{
						System.out.println(e);
					}
				
						
					}
				break;
						

			case 7: 

				while (true) 
				{
					String productWishlist;
					int i;
					System.out.print("Enter the number of products to add in wishlist :");
					choice = Integer.parseInt(sc.nextLine());
					if (choice == 0) 
					{
						System.out.println("Products are not added");
						break;
					}
					if (choice > 0) 
					{
						System.out.println("Enter products name one by one : ");
						for (i = 0; i < choice; i++)
							{
								productWishlist = sc.nextLine();
								wi.addWishList(productWishlist);
							}
							System.out.println("Products are added successfully ");
					}
						break;

					} 
			
				break;

				case 8:
					System.out.println("-----WHISHLIST------");
					System.out.println("The products are : ");
					System.out.println(wi.viewWishList());
					break;

			}
		}
	
	case 4:
		String upassword, repassword,userId,email,phNum;
		while (true) {
			System.out.println("Hello User");
			System.out.println("Enter your username");
		    userId = sc.next();
			try{
			 Validator.Isvaliduname(userId);
			 break;
			}
			catch(Isvaliduname e) {
				System.out.println(e);
			}
		}
		while (true) {
			System.out.println("Enter your password");
			upassword = sc.next();
			try {
				Validator.Isvalidpwd(upassword);
				break;
			} catch (Isvalidpwd e) {
				System.out.println(e);
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
			 email = sc.next();try {
				Validator.Isvalidemail(email);
				break;
			} catch (Isvalidemail e) {
				System.out.println(e);
			}

			
			
		}
		while (true) {
			System.out.println("Enter your phone number");
			phNum = sc.next();
			try{
				Validator.Isvalidphone(phNum);
				break;
			}
			catch(Isvalidphone e) {
				System.out.println(e);
			
			}
		}
		usr.setEmail(email);
		usr.setPhNum(Integer.parseInt(phNum));
		usr.setPassword(upassword);
		usr.setUserId(userId);
		break;
	case 5:
		String user,userPsw;
		while (true) {
			System.out.println("welcome user to login");
			System.out.println("Enter your username ");
			 user = sc.next();
			System.out.println("Enteryour password ");
			userPsw = sc.next();
			if (user.equals(usr.getUserId()) && userPsw.equals(usr.getPassword())) {
				System.out.println("---LOGGED IN---");
				break;
			} else {
				System.out.println("Invalid userID or PASSWORD");
			}}
		System.out.println("1.Add item to cart\n"+" 1. Cancel your order\n" + "3.Placing the order\n"+" 4.Logout");
		int option1 = sc.nextInt();
		switch(option1) {
		case 1:
			
		case 2:
			cms.cancelAnOrder();
		case 3:
			posi.placingAnOrder();
		case 4:
			System.exit(0);
		default:
			System.out.println("Enter the appropriate option");
		}
		
}
	
	}

}
}
