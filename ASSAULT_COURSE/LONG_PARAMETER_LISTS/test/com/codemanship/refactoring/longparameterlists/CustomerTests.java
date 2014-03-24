package com.codemanship.refactoring.longparameterlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTests {

	@Test
	public void customerSummaryIncludesFullNameWithTitleAndCityPostCodeAndCountry() throws Exception {
		Customer customer = new Customer();
		customer.setFirstName("Jason");
		customer.setLastName("Gorman");
		customer.setTitle("Mr");
		Address address = new Address();
		address.setCity("London");
		address.setPostCode("SW23 9YY");
		address.setCountry("United Kingdom");
		customer.setAddress(address);
		assertEquals("Mr Jason Gorman, London, SW23 9YY, United Kingdom", customer.getSummary());
	}
}
