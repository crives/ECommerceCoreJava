package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Customer;

//import java.util.List;

//import com.ecommerce.model.Customer;

public class ECommerce_Controller {
	
	static List<Customer> accounts = new ArrayList<>();
	
	public ECommerce_Controller( ) {
		
		accounts.add(
				new Customer("C100", "Caroline Rives", "car.rives@gmail.com", "password")
		);
		
		accounts.add(new Customer("B200", "Benjamin", "ben.jamin@gmail.com", "password"));
		
	}

	public void createAccount(String email, String password) {
		Customer newAccount = new Customer(email, password);
		
		accounts.add(newAccount);
		
		
	}
	
	public static void canLogin(String email, String password) {
	
	
		int index = 0;
		for (Customer account : accounts) {
			if (account.getEmail().equals(email)) {
				if (account.getPassword().equals(password)) {

					System.out.println("You are successfully logged in!");
					showItems();
				}
				System.out.println("Wrong Password!");
			}
			index++;
		}
		System.out.println("Not registered");
		
	}
	
	
	public static void showItems() {
		
		
	}
	
	
}
