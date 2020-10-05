package com.ecommerce.model;

public class InvoiceProduct {

	public int invoice_product_id;
	public int invoice_number;
	public int item_code;
	public boolean can_return;
	public boolean returned;
	
	public InvoiceProduct(int invoice_product_id, int invoice_number, int item_code, boolean can_return,
			boolean returned) {
		super();
		this.invoice_product_id = invoice_product_id;
		this.invoice_number = invoice_number;
		this.item_code = item_code;
		this.can_return = can_return;
		this.returned = returned;
	}

	public int getInvoice_product_id() {
		return invoice_product_id;
	}

	public void setInvoice_product_id(int invoice_product_id) {
		this.invoice_product_id = invoice_product_id;
	}

	public int getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}

	public int getItem_code() {
		return item_code;
	}

	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}

	public boolean isCan_return() {
		return can_return;
	}

	public void setCan_return(boolean can_return) {
		this.can_return = can_return;
	}

	public boolean isReturned() {
		return returned;
	}

	public void setReturned(boolean returned) {
		this.returned = returned;
	}

	@Override
	public String toString() {
		return "InvoiceProduct [invoice_product_id=" + invoice_product_id + ", invoice_number=" + invoice_number
				+ ", item_code=" + item_code + ", can_return=" + can_return + ", returned=" + returned + "]";
	}
	
}
