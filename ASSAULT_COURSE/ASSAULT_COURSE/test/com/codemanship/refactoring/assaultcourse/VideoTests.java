package com.codemanship.refactoring.assaultcourse;

import static org.junit.Assert.*;

import org.junit.Test;


public class VideoTests {
	
	@Test(expected=CustomerUnderageException.class)
	public void customerMustBeOverTwelveToRentAVideoRatedTwelve() throws Exception {
		Customer customer = new Customer(null, null, "2004-01-01");
		Video video = new Video(null, Rating.TWELVE);
		video.rentFor(customer);
	}
	
	@Test
	public void videoRentedByCustomerOfLegalAgeIsAddedToCustomersRentedVideos() throws Exception {
		Customer customer = new Customer(null, null, "1964-01-01");
		Video video = new Video(null, Rating.TWELVE);
		video.rentFor(customer);
		assertTrue(customer.getRentedVideos().contains(video));
	}

}
