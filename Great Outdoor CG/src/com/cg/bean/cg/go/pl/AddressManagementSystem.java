package ProjectDemo;

import java.util.Scanner;

public class AddressManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		AddressImplementation ai =  new AddressImplementation();
		
		System.out.println("1. Add an address :\n"
				+ "2. Upadte an address :\n"
				+ "3. Delete an address :\n"
				+ "4. Add Product in  Whislist : \n"
				+ "5. Display Whislist :\n"
				+ "6. View Inventory\n");
		do {
			
			System.out.println("Enter your choice :");
				ch = sc.nextInt();
		
			switch(ch){
			case 1: ai.addAddress(); break;
			case 2: ai.updateAddress(); break;
			case 3: ai.deleteAddress(); break;
			case 4: ai.addProductWhislist(); break;
			case 5: ai.viewWhislist(); break;
			case 6: ai.viewInventory(); break;
			default: System.out.println(" Wrong choice !!"); break; 
			}	
		}
		while(ch<7);		
		
	
	/*ai.addAddress(); 
	 ai.updateAddress();
	 ai.deleteAddress(); 
	 ai.addProductWhislist(); 
	
	 ai.viewWhislist(); 
		*/
	}

}
