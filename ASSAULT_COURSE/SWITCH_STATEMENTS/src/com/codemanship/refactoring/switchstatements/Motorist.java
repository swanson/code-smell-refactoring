package com.codemanship.refactoring.switchstatements;

import java.util.Calendar;
import java.util.Date;

public class Motorist {
	
	private int pointsOnLicense;
	private Date dateOfBirth;

	public Motorist(Date dateOfBirth, int pointsOnLicense ) {
		this.pointsOnLicense = pointsOnLicense;
		this.dateOfBirth= dateOfBirth;
	}

	public int getPointsOnLicense() {
		return pointsOnLicense;
	}

	public int getAge() {
		Calendar calDateOfBirth = createCalendar(dateOfBirth);
		Calendar calNow = createCalendar(new java.util.Date());   
		int ageYr = (calNow.get(Calendar.YEAR) - calDateOfBirth.get(Calendar.YEAR));   
		int ageMo = (calNow.get(Calendar.MONTH) - calDateOfBirth.get(Calendar.MONTH));      
		return adustYearsDownIfNegativeMonthDifference(ageYr, ageMo);
	}

	private int adustYearsDownIfNegativeMonthDifference(int ageYr, int ageMo) {
		if (ageMo < 0)   
		{   
			ageYr--;   
		}
		return ageYr;
	}

	private Calendar createCalendar(Date date) {
		Calendar calDateOfBirth = Calendar.getInstance();
		calDateOfBirth.setTime(date);
		return calDateOfBirth;
	}

}
