package com.codemanship.refactor.duplicatecode;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Account {
	
	private float balance = 0;
	
	private List transactions = new ArrayList();

	private String lastTransactionDate;

	public float getBalance() {
		return balance;
	}

	public void credit(float amount) {
		balance += amount;
		transactions.add(new Transaction(true, amount));
		Calendar calendar = Calendar.getInstance();
		lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
						calendar.get(Calendar.MONTH) + "/" + 
						calendar.get(Calendar.YEAR);
	}

	public void debit(float amount) {
		balance -= amount;
		transactions.add(new Transaction(true, -amount));
		Calendar calendar = Calendar.getInstance();
		lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
						calendar.get(Calendar.MONTH) + "/" + 
						calendar.get(Calendar.YEAR);
	}

	public Transaction getLastTransaction() {
		return (Transaction)transactions.get(transactions.size()  -1);
	}

	public String getLastTransactionDate() {
		return lastTransactionDate;
	}

}
