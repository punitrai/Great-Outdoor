package com.cg.pl;

import java.util.Scanner;

import com.cg.bean.ProductManagementSystem;
import com.cg.service.ProductManagementImplementation;
import com.cg.utilites.Utilities;

public class ProductManaSystemdemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		ProductManagementSystem P = new ProductManagementSystem();
		ProductManagementImplementation psi = new ProductManagementImplementation();
		System.out.println("Enter /n 1. TO ADD A PRODUCT " + "2. TO EDIT A PRODUCT" + "3. TO DELETE A PRODUCT");
		while (true) {
			System.out.println("Enter the option");
			int option = scr.nextInt();
			switch (option) {
			case 1:
				while (true) {
					System.out.println("Enter the product Id");
					String ProductId = scr.next();
					boolean flag = Utilities.ProductIdValidate(ProductId);
					if (!flag) {
						System.out.println("Enter the Id as an Alphanumeric");}
					else
						{break;}
					P.setProductId(ProductId);
				}
				while (true) {
					System.out.println("Enter the product Name");
					String ProductName = scr.next();
					boolean flag = Utilities.NameValidate(ProductName);
					if (!flag)
						System.out.println("Enter the name in Alphabets");
					else
						break;
					P.setProductName(ProductName);
				}
				while (true) {
					System.out.println("Enter the product quantity");
					String quantity = scr.next();
					boolean flag = Utilities.QuantityValidate(quantity);
					if (!flag)
						System.out.println("Enter the quantity in numeric");
					else
						break;
					P.setQuantity(Integer.parseInt(quantity));
				}
				while (true) {
					System.out.println("Enter the product price");
					String Price = scr.next();
					boolean flag = Utilities.PriceValidate(Price);
					if (!flag)
						System.out.println("Enter the price in numeric");
					else
						break;
					P.setPrice(Double.parseDouble(Price));
				}
				while (true) {
					System.out.println("Enter the colour");
					String colour = scr.next();
					boolean flag = Utilities.ColourValidate(colour);
					if (!flag)
						System.out.println("Enter the colour in alphabets");
					else
						break;
					P.setColour(colour);
				}
				while (true) {
					System.out.println("Enter the manufacturer");
					String manufacturer = scr.next();
					boolean flag = Utilities.ManufactureValidate(manufacturer);
					if (!flag)
						System.out.println("Enter the Id as an Alphanumeric");
					else
						break;
					P.setManufacturer(manufacturer);
				}
				while (true) {
					System.out.println("Enter the product category");
					String ProductCategory = scr.next();
					boolean flag = Utilities.CategoryValidate(ProductCategory);
					if (!flag)
						System.out.println("Enter the category in numeric");
					else
						break;
					P.setProductCategory(Integer.parseInt(ProductCategory));
				}
				psi.AddProduct(P);
				break;
			case 2:
				System.out.println("Enter the Product ID to be deleted");
				String ProductId = scr.next();
				P.getProductId();
				psi.DeleteProduct(ProductId);
				break;
			case 3:
				System.out.println("Enter the Product ID to edit");
				String ProductId1 = scr.next();
				System.out.println("1. Colour \n" + "2. Price \n" + "3.Quantity");
				int op = scr.nextInt();
				switch (op) {
				case 1:
					System.out.println("Enter the Colour");
					String colour = scr.next();
					P.setColour(colour);
					psi.EditProductcolor(P, ProductId1);
					break;
				case 2:
					System.out.println("Enter the Price");
					String Price = scr.next();
					P.setPrice(Double.parseDouble(Price));
					psi.EditProductprice(P, ProductId1);
					break;
				case 3:
					System.out.println("Enter the Quantity");
					String quantity = scr.next();
					P.setQuantity(Integer.parseInt(quantity));
					psi.EditProductQuantity(P, ProductId1);
				}
			}

		}
	}
}