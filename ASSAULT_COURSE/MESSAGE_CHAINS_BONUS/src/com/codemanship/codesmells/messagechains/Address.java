package com.codemanship.codesmells.messagechains;

public class Address {
	
	private Country country;

	public Address(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

}
