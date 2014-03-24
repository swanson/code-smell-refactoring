package com.codemanship.codesmells.messagechains;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public class Invoice {
	
	static final double SHIPPING_COST_OUTSIDE_EU = 10;
	private List<InvoiceItem> invoiceItems = new ArrayList<InvoiceItem>();
	private Customer customer;

	public Invoice(Customer customer) {
		this.customer = customer;
	}

	public void addItem(InvoiceItem invoiceItem) {
		invoiceItems.add(invoiceItem);
	}

	public double getTotalPrice() {
		double invoiceTotal = 0;
		
		for (Iterator iterator = invoiceItems.iterator(); iterator.hasNext();) {
			InvoiceItem invoiceItem = (InvoiceItem) iterator.next();
			invoiceTotal += invoiceItem.getSubtotal();
		}
		
		Address address = customer.getAddress();
		Country country = address.getCountry();
		
		if(!country.isInEurope()){
			invoiceTotal += SHIPPING_COST_OUTSIDE_EU;
		}
		return invoiceTotal;
	}

	
}
