package com.codemanship.refactoring.divergentchange;

import static org.junit.Assert.*;

import org.junit.Test;


public class BankAccountTests {
	
	@Test
	public void debitingAccountShouldDeductAmountFromBalance()  {
		Account account = new Account(12345678);
		account.credit(100);
		account.debit(50);
		assertEquals(50, account.getBalance(), 0);
	}
	
	@Test
	public void accountXmlShouldBeFormattedCorrectly()  {
		Account account = new Account(12345678);
		String expectedXml = "<account><id>12345678</id><balance>0.0</balance></account>";
		assertEquals(expectedXml , account.toXml());
	}

}
