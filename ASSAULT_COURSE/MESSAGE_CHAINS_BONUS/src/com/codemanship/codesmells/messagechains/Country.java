package com.codemanship.codesmells.messagechains;

public class Country {
	
	private boolean inEurope = false;
	
	public Country(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public boolean isInEurope() {
		return inEurope;
	}

}
