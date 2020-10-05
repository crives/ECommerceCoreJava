package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Customer;

//import java.util.List;

//import com.ecommerce.model.Customer;

public class ECommerce_Controller {
	
	List<Customer> accounts = new ArrayList<>();
	
	public ECommerce_Controller( ) {
		
		accounts.add(
				new Customer("C100", "Caroline Rives", "car.rives@gmail.com", "password")
		);
		
		accounts.add(new Customer("B200", "Benjamin", "ben.jamin@gmail.com", "password"));
		
	}

	public void createAccount(String email, String password) {
		new Customer(email, password);
	}
	
	
	
}
