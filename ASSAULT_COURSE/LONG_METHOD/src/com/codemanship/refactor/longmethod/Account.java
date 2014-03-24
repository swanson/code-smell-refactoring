package com.codemanship.refactor.longmethod;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Account {
	
	private float balance = 0;
	
	private List transactions = new ArrayList();

	private String lastDebitDate;
	
	private float owing = 0;

	public float getBalance() {
		return balance;
	}

	public void credit(float amount) {
		balance += amount;
	}

	public void debit(float amount) {
		
		// deduct amount from balance
		balance -= amount;
		
		// record transaction
		transactions.add(new Transaction(true, amount));
		
		// update last debit date
		Calendar calendar = Calendar.getInstance();
		
		lastDebitDate = calendar.get(Calendar.DATE) + "/" +
		calendar.get(Calendar.MONTH) + "/" + 
		calendar.get(Calendar.YEAR);
	}

	public Transaction getLastTransaction() {
		return (Transaction)transactions.get(transactions.size()  -1);
	}

	public String getLastDebitDate() {
		return lastDebitDate;
	}
}
