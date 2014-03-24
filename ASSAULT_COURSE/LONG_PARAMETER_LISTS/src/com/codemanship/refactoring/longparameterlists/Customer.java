package com.codemanship.refactoring.longparameterlists;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String title;
	private Address address;
	


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTitle() {
		return title;
	}

	public Address getAddress() {
		return address;
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

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSummary() {
		return buildCustomerSummary(getFirstName(), getLastName(), getTitle(), 
				address.getCity(), address.getPostcode(), address.getCountry());
	}
	
	private String buildCustomerSummary(String customerFirstName, String customerLastName,
			String customerTitle, String customerCity, String customerPostCode, String customerCountry) {
		return customerTitle + " " + customerFirstName + " " + customerLastName + ", " +
		customerCity + ", " + customerPostCode + ", " + customerCountry;
	}
}
