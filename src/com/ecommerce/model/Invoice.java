package com.ecommerce.model;

import java.sql.Date;

public class Invoice {

	public int invoice_number;
	public Date order_date;
	public String name;
	public int total;
	
	public Invoice(int invoice_number, Date order_date, String name, int total) {
		super();
		this.invoice_number = invoice_number;
		this.order_date = order_date;
		this.name = name;
		this.total = total;
	}

	public int getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Invoice [invoice_number=" + invoice_number + ", order_date=" + order_date + ", name=" + name
				+ ", total=" + total + "]";
	}
	
}
