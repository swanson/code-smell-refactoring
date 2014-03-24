package com.codemanship.refactoring.featureenvy;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.codemanship.refactoring.featureenvy.InsuranceQuote;
import com.codemanship.refactoring.featureenvy.Motorist;
import com.codemanship.refactoring.featureenvy.RiskFactor;


public class InsuranceQuotationTests {
	
	@Test
	public void motoristWithNoPointsOnLicenseAndOverTwentyFivePresentsLowRisk() throws Exception {
		assertEquals(RiskFactor.LOW_RISK, calculateMotoristRisk("1970-01-01", 0));
	}


	@Test
	public void motoristWithOneToThreePointsOnLicenseAndOverTwentyFivePresentsModerateRisk() throws Exception {
		assertEquals(RiskFactor.MODERATE_RISK, calculateMotoristRisk("1970-01-01", 3));
	}
	
	@Test
	public void motoristWithMoreThanThreePointsOnLicenseOverTwentyFivePresentsHighRisk() throws Exception {
		assertEquals(RiskFactor.HIGH_RISK, calculateMotoristRisk("1970-01-01", 4));
	}
	
	@Test
	public void anyMotoristUnderTwentyFiveIsHighRisk() throws Exception {
		assertEquals(RiskFactor.HIGH_RISK, calculateMotoristRisk("1990-01-01", 0));
	}
	
	@Test
	public void lowRiskMotoristsPayPremiumOfTwoPercentOfInsuranceValue() throws Exception {
		InsuranceQuote quote = buildInsuranceQuoteForMotorist("1960-01-01", 0);
		assertEquals(200, quote.calculateInsurancePremium(10000), 0);
	}
	
	@Test
	public void moderateRiskMotoristsPayPremiumOfFourPercentOfInsuranceValue() throws Exception {
		InsuranceQuote quote = buildInsuranceQuoteForMotorist("1960-01-01", 1);
		assertEquals(400, quote.calculateInsurancePremium(10000), 0);
	}
	
	@Test
	public void highRiskMotoristsPayPremiumOfSixPercentOfInsuranceValue() throws Exception {
		InsuranceQuote quote = buildInsuranceQuoteForMotorist("1990-01-01", 0);
		assertEquals(600, quote.calculateInsurancePremium(10000), 0);
	}
	
	private RiskFactor calculateMotoristRisk(String dateOfBirth, int pointsOnLicense) throws ParseException {
		return buildInsuranceQuoteForMotorist(dateOfBirth, pointsOnLicense).calculateMotoristRisk();
	}


	private InsuranceQuote buildInsuranceQuoteForMotorist(String dateOfBirth,
			int pointsOnLicense) throws ParseException {
		return new InsuranceQuote(new Motorist(parseDate(dateOfBirth), pointsOnLicense));
	}


	private Date parseDate(String dateOfBirth) throws ParseException {
		return new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
	}
	


}
