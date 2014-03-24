package com.codemanship.refactoring.assaultcourse;

public class Address {
	
	private String house;
	private String street;
	private String city;
	private String postcode;
	
	public Address(String house, String street, String city, String postcode) {
		this.house = house;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}
	public String getHouse() {
		return house;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostcode() {
		return postcode;
	}
}
