package com.codemanship.refactoring.dataclumps;

import static org.junit.Assert.*;

import org.junit.Test;


public class CustomerTests {

	@Test
	public void customerAddressSummaryIncludesHouseStreetCityPostCodeAndCountry() throws Exception {
		Customer customer = new Customer();
		customer.setHouse("43");
		customer.setStreet("Rankin Road");
		customer.setCity("London");
		customer.setPostcode("SW23 9YY");
		customer.setCountry("United Kingdom");
		assertEquals("43, Rankin Road, London, SW23 9YY, United Kingdom", customer.getAddressSummary());
	}
}
