package com.codemanship.refactor.copyandpaste;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import com.codemanship.refactor.copyandpaste.SettlementAccount;
import com.codemanship.refactor.copyandpaste.Transaction;

public class LoyaltyAccountTests {
	
	@Test
	public void debitingAccountShouldDeductAmountFromBalanceRecordTransactionAndUpdateLastdebitDate() throws Exception {
		LoyaltyAccount account = new LoyaltyAccount();
		account.credit(100);
		account.debit(50);
		assertEquals(50, account .getBalance(), 0);
		Transaction lastTransaction = account.getLastTransaction();
		assertTrue(lastTransaction.isDebit());
		assertEquals(-50, lastTransaction.getAmount(), 0);

		Calendar calendar = Calendar.getInstance();
		
		assertEquals(calendar.get(Calendar.DATE) + "/" +
				calendar.get(Calendar.MONTH) + "/" + 
				calendar.get(Calendar.YEAR),
				account.getLastTransactionDate());
	}
	
}
