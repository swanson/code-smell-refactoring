package com.codemanship.refactoring.inappropriateintimacy;

public class Motorist {
	

	public final License license;
	private final String surname;

	private final String firstName;
	private final String title;


	public Motorist(License license, String surname, String firstName, String title) {
		license.setMotorist(this);
		this.license = license;
		this.surname = surname;
		this.firstName = firstName;
		this.title = title;
		
	}

	public String getSurname() {
		return surname;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getTitle() {
		return title;
	}
	

	public RiskFactor getRiskFactor() {
		if(license.getPoints() > 3)
			return RiskFactor.HIGH_RISK;
		if(license.getPoints() > 0)
			return RiskFactor.MODERATE_RISK;
		return RiskFactor.LOW_RISK;
	}

}
