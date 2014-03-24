package com.codemanship.refactoring.inappropriateintimacy;

public class License {
	
	private Motorist motorist;
	private int points = 0;
	
	public void setMotorist(Motorist motorist) {
		this.motorist = motorist;
	}

	public int getPoints() {
		return points;
	}

	public void addPoints(int points) {
		this.points += points;
	}
	
	public String getSummary() {
		return motorist.getTitle() + " " + motorist.getFirstName()
		+ " " + motorist.getSurname() + ", " + Integer.toString(getPoints())
		+ " points";
	}
	

}
