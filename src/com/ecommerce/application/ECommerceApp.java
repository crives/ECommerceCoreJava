package com.ecommerce.application;

import java.util.Scanner;

import com.ecommerce.controller.ECommerce_Controller;

public class ECommerceApp {

	static Scanner sc = new Scanner(System.in);
	
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
		System.out.println("| 4. Replace an Item    |");
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
			buyItem();
			break;
		case 4:
			replaceItem();
			break;
		case 5: 
			exit = true;
			break;	
		
	}
			sc.close();
	}
	
	public static void createAccount() {
		
		System.out.println("Enter your email:");
		String email = sc.nextLine();
		
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		
		controller.createAccount(email, password);
	}
	
	public static void login() {
		
		
	}
	
	public static void buyItem() {
		
		
	}
	
	public static void replaceItem() {
		
		
	}
}
