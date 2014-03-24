package com.codemanship.refactoring.dataclumps;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String title;
	private String house;
	private String street;
	private String city;
	private String postcode;
	private String country;


	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddressSummary(){
		return getHouse() + ", " + getStreet() + ", " + getCity() + ", " +
				getPostcode() + ", " + getCountry();
	}

}
