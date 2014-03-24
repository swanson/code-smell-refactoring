package com.codemanship.refactoring.assaultcourse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Video {

	private final String title;
	private final Rating rating;


	public Video(String title, Rating rating) {
		this.title = title;
		this.rating = rating;
	}
	
	public Rating getRating() {
		return rating;
	}

	public String getTitle() {
		return title;
	}

	public void rentFor(Customer customer) throws CustomerUnderageException {
		if(isUnderAge(customer))
			throw new CustomerUnderageException();
		customer.addRental(this);
	}

	private boolean isUnderAge(Customer customer) {

			try {
				// calculate customer's age in years and months
				
				// parse customer date of birth
				Calendar calDateOfBirth = Calendar.getInstance();
				calDateOfBirth.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(customer.getDateOfBirth()));
				
				// get current date
				Calendar calNow = Calendar.getInstance();
				calNow.setTime(new java.util.Date());  
				
				// calculate age different in years and months
				int ageYr = (calNow.get(Calendar.YEAR) - calDateOfBirth.get(Calendar.YEAR));   
				int ageMo = (calNow.get(Calendar.MONTH) - calDateOfBirth.get(Calendar.MONTH));
				
				// decrement age in years if month difference is negative
				if (ageMo < 0)   
				{   
					ageYr--;   
				}      
				int age = ageYr;

				// determine if customer is under legal age for rating
				switch(rating){
				case TWELVE:
					return age < 12;
				case FIFTEEN:
					return age < 15;
				case EIGHTEEN:
					return age < 18;
				default:
					return false;
				}
			
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return false;		

	}

}
