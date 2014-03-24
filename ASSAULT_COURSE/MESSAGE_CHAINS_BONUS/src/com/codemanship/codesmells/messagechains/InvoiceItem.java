package com.codemanship.codesmells.messagechains;

public class InvoiceItem {
	

	private String itemName;
	private int quantity;
	private double unitPrice;

	public InvoiceItem(String itemName, int quantity, double unitPrice) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public double getSubtotal() {
		return unitPrice * quantity;
	}

}
