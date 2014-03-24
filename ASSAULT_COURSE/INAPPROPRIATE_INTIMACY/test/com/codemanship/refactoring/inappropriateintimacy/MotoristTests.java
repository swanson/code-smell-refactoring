package com.codemanship.refactoring.inappropriateintimacy;

import static org.junit.Assert.*;

import org.junit.Test;


public class MotoristTests {


	@Test
	public void motoristWithNoPointsOnLicenseIsLowRisk() {
		assertEquals(RiskFactor.LOW_RISK, createMotoristWithPointsOnLicense(0).getRiskFactor());
	}
	
	@Test
	public void motoristWithOneToThreePointsOnLicenseIsModerateRisk() {
		assertEquals(RiskFactor.MODERATE_RISK, createMotoristWithPointsOnLicense(1).getRiskFactor());
	}
	
	@Test
	public void motoristWithMoreThanThreePointsOnLicenseIsHighRisk() {
		assertEquals(RiskFactor.HIGH_RISK, createMotoristWithPointsOnLicense(4).getRiskFactor());
	}

	public Motorist createMotoristWithPointsOnLicense(int points) {
		License license = new License();
		license.addPoints(points);
		Motorist motorist = new Motorist(license, "", "", "");
		return motorist;
	}


}
