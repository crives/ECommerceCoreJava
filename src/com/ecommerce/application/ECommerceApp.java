package com.ecommerce.application;

import java.util.Scanner;

import com.ecommerce.controller.ECommerce_Controller;
import com.ecommerce.model.Customer;
import com.ecommerce.model.InvoiceProduct;

public class ECommerceApp {
		
	private static Customer currentCustomer = null;
	private static InvoiceProduct invoiceProduct = null;
	
	private static Scanner sc = new Scanner(System.in);
	
	static ECommerce_Controller controller = new ECommerce_Controller();
	
	public static void main(String[] args) {
		
		boolean exit = false;
		int choice = 0;
		
		while(!exit)
		System.out.println("Standalone Ecommerce App");
		System.out.println("+=======================+");
		System.out.println("| 1. Register           |");
		System.out.println("| 2. Login              |");
		System.out.println("| 3. Buy an Item        |");
		System.out.println("| 4. Return an Item     |");
		System.out.println("| 5. Exit               |");
		System.out.println("+=======================+");
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			createAccount();
			break;
		case 2: 
			login();
			break;
		case 3: 
			showItems();
			break;
		case 4:
			returnItem();
			break;
		case 5: 
			exit = true;
			break;	
		
	}
			sc.close();
	}
	
	public static void createAccount() {
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your email:");
		String email = sc.nextLine();
		
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		
		// add it to in-storage memory
		controller.createAccount(email, password);
	}
	
	public static void login() {
		
		System.out.println("Enter email:");
		String email = sc.nextLine();
		
		System.out.println("Enter password:");
		String password = sc.nextLine();
				
		int index = ECommerce_Controller.canLogin(email, password);
		while (index != -1) {
			showItems();
		}
		
		currentCustomer = new Customer(email, password);
			
		
	}
	
	public static void showItems() {
		
		System.out.println("		Standalone Ecommerce App");
		System.out.println("+=====================================+");
		System.out.println("| 	Items  		ItemCode  		Price |");
		System.out.println("|                                     |");
		System.out.println("| 1. Jacket		  Ja1			 $20  |");
		System.out.println("| 2. Jeans        Je1            $10  |");
		System.out.println("| 3. Shirt        Sh1            $5   |");
		System.out.println("|        							  |");
		System.out.println("| 4. Exit                             |");
		System.out.println("+=====================================+");
		System.out.println("");
		System.out.println(" Which item would you like to send payment for?");

		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			buyItem("Ja1");
			break;
		case 2:
			buyItem("Je1");
			break;
		case 3:
			buyItem("Sh1");
			break;
		case 4:
			break;
		}
	}
	
	
	public static void buyItem(String item_code) {
		
		
		
		
		System.out.println("Standalone Ecommerce App Invoice");
		System.out.println("+===============================+");
		System.out.println("| Customer Name: " + currentCustomer.getName() + " Date:"  );
		
		// Invoice Number need to fill out
		System.out.println("| Invoice No:" );
		System.out.println("| Items    ItemCode      Price  |");
		
		
		System.out.println("| 1.");
	}
	
	public static void returnItem() {
		
		
	}
}
