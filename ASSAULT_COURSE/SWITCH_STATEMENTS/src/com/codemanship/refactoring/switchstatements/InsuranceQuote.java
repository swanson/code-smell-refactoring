package com.codemanship.refactoring.switchstatements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsuranceQuote {
	
	private Motorist motorist;

	public InsuranceQuote(Motorist motorist) {
		this.motorist = motorist;
	}
	
	public RiskFactor calculateMotoristRisk() {
		
		if(motorist.getPointsOnLicense() > 3 || motorist.getAge() < 25)
			return RiskFactor.HIGH_RISK;
	
		if(motorist.getPointsOnLicense() > 0)
			return RiskFactor.MODERATE_RISK;
		
		return RiskFactor.LOW_RISK;
	}

	public double calculateInsurancePremium(double insuranceValue) {
		RiskFactor riskFactor = calculateMotoristRisk();
		
		switch(riskFactor){
		case LOW_RISK :
			return insuranceValue * 0.02;
		case MODERATE_RISK :
			return insuranceValue * 0.04;
		default :
			return insuranceValue * 0.06;
		}

	}



}
