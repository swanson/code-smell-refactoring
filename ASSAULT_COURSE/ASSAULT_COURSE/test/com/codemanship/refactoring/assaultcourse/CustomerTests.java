package com.codemanship.refactoring.assaultcourse;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTests {
	
	@Test
	public void customerSummaryIncludesFullNameAndAddress() {
		Address address = new Address("15", "High Street", "London", "WC1 2XX");
		Customer customer = new Customer("Mr T Bidley", address, "1971-01-01");
		assertEquals("Mr T Bidley, 15 High Street, London, WC1 2XX", customer .getSummary());
	}

}
