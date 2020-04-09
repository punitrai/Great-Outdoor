package ProjectDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressImplementation implements AddressInterface{

	String adrs; int i;
	String products;
	List<String> adrslist = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addAddress() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the address : "); 
		
		System.out.println("Enter city name : ");
		adrs = sc.nextLine();
		adrslist.add(adrs);
		System.out.println("Enter state name : ");
		adrs = sc.nextLine();
		adrslist.add(adrs);
		System.out.println("Enter country name : ");
		adrs = sc.nextLine();
		adrslist.add(adrs);
		
		for(String s1: adrslist) {
			System.out.println("Your given address :  "+s1);
		}
	}

	List<String> adrslist1 = new ArrayList<String>(); int ch;
	@Override
	public void updateAddress() {
		// TODO Auto-generated method stub
	
		System.out.println("====> Stored Address : ");
		for(i=0; i<adrslist.size(); i++) {
			adrslist1.add(adrslist.get(i));
			}
		System.out.println(adrslist1);
		
		do {
			System.out.println("Upadte Address ---------> ");
			System.out.println("1.City\n2.State\n3.Country\n4.Press 4 for no update\n ");
			System.out.println("Choose correct option to update the address  :");	
			 ch = sc.nextInt();
		switch(ch) {
		case	1: System.out.println("City : ");
			System.out.println("---------------------------------");
				adrs = sc.nextLine();
				adrslist1.set(0,adrs);
				break;
		case	2: System.out.println("State : "); 	
				adrs = sc.nextLine();
				adrslist1.set(1,adrs);
				break;
		case	3: System.out.println("Country : ");
				adrs  = sc.nextLine();
				adrslist1.set(2,adrs);
				break;
	/*	case	4: System.out.println("For no update press 4 : "); 
				break;
		*/
		default : System.out.println("No update has taken : "); break;
			}
		}while(ch<4);
	
/*		
		for(int i=0;i<adrslist1.size();i++) {
			adrs = sc.nextLine();
			adrslist1.set(i,adrs);
		}
	*/
		for(String s1: adrslist1) {
			System.out.println(s1);
		}
	}

	@Override
	public void deleteAddress() {
		// TODO Auto-generated method stub
		
		System.out.println("=======> New Updated Address : ");
		for(i=0;i<adrslist1.size();i++) {
			adrslist1.get(i);
		}
		System.out.println(adrslist1);
		
		System.out.println("Delete the address :");

		adrslist1.clear();
		for(String s1: adrslist1) {
			System.out.println(s1);
		}
	}
	
List<String> pdtlist = new ArrayList<String>(); int n;
	@Override
	public void addProductWhislist() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number product to Whislist :");
		 n = sc.nextInt(); 
		System.out.println("Enter the product name one by one :"); 
			for( i = 0; i <= n; i++) {
				products = sc.nextLine();
				pdtlist.add(products);
		}
		for(String s1: pdtlist) {
			System.out.println(s1);
		} 
	}

	@Override
	public void viewWhislist() {
		// TODO Auto-generated method stub
	
		for(i=0;i<pdtlist.size();i++) 
			pdtlist.get(i);
		for(String s1: pdtlist) {
			System.out.println("Product List : "+s1);
		}	
	}

	List<String> orderlist = new ArrayList<String>();
	int order;
	String ordername;
	@Override
	public void viewInventory() {
		// TODO Auto-generated method stub
	
		System.out.println("Give 3 order : ");
		for(i = 0; i < 3; i++ ) {
			ordername = sc.nextLine();
			orderlist.add(ordername);
		}
		System.out.println("Size of ArrayList -----+++++++++++++"+orderlist.size());
		System.out.println("The list of the order : ");
		for(i = 0; i< orderlist.size(); i++) 
			System.out.println(orderlist.get(i));
		
		System.out.println("Before cancel order ---- Size of ArrayList : "+orderlist);
		System.out.println("Enter the no. of order to cancel : ");
			
		order = sc.nextInt();
		 
		for(i = 0; i< orderlist.size(); i++) {
			if(i==(order-1))
			System.out.println("---------"+orderlist.remove(i)+"---------- order has been canceled");
		}
		System.out.println(orderlist.size());
		System.out.println("After cancel order ------- Size of ArrayList : "+orderlist);
//		System.out.println(orderlist.get(i) + " Order has been canceled !!");
		
		System.out.println("----> "+orderlist.size());

		for(String s1: orderlist)
		System.out.println("View Inventory : "+s1);
	}
}