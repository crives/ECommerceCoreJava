package com.ecommerce.model;

public class Product {

	public String item_code;
	public String item;
	public int price;
	
	public Product(String item_code, String item, int price) {
		super();
		this.item_code = item_code;
		this.item = item;
		this.price = price;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [item_code=" + item_code + ", item=" + item + ", price=" + price + "]";
	}
	
}
