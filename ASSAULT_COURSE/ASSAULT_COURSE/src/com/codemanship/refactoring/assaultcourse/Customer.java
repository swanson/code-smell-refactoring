package com.codemanship.refactoring.assaultcourse;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private List<Video> rentals = new ArrayList<Video>();
	private Address address;
	private final String dateOfBirth;
	private final String name;


	public Customer(String name, Address address, String dateOfBirth) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public List<Video> getRentedVideos() {
		return rentals;
	}

	public void addRental(Video video) {
		rentals.add(video);
	}

	public String getSummary() {
		return name + ", " + address.getHouse() + " " + address.getStreet() + ", " 
				+ address.getCity() + ", " + address.getPostcode();
	}

}
