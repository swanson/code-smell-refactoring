package com.codemanship.refactor.copyandpaste;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class SettlementAccount {
	
	private float balance = 0;
	
	private List transactions = new ArrayList();

	private String lastTransactionDate;
	
	private float owing = 0;

	public float getBalance() {
		return balance;
	}

	public void credit(float amount) {
		executeTransaction(amount);
	}

	public void debit(float amount) {
		executeTransaction(-amount);
	}
	
	public void borrow(float amount){
		owing += amount;
	}
	
	public void settle(){
		balance -= owing;
	}

	private void executeTransaction(float amount) {
		balance += amount;
		recordTransaction(amount);
		updateLastTransactionDate();
	}

	public Transaction getLastTransaction() {
		return (Transaction)transactions.get(transactions.size()  -1);
	}

	public String getLastTransactionDate() {
		return lastTransactionDate;
	}

	private void recordTransaction(float amount) {
		transactions.add(new Transaction(true, amount));
	}
	
	private void updateLastTransactionDate() {
		Calendar calendar = Calendar.getInstance();
		lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
		calendar.get(Calendar.MONTH) + "/" + 
		calendar.get(Calendar.YEAR);
	}

}
