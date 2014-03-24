package com.codemanship.refactoring.inappropriateintimacy;

import static org.junit.Assert.*;

import org.junit.Test;


public class LicenseTests {
	
	@Test
	public void licenseSummaryShouldIncludeLicenseHolderFullNameAndPoints(){
		License license = new License();
		license.addPoints(3);
		Motorist motorist = new Motorist(license, "Gorman", "Jason", "Mr");
		assertEquals("Mr Jason Gorman, 3 points", license.getSummary());
	}

}
