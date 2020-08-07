package com.goibibo.auto.GoIbibo;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.goibibo.auto.pageObjects.checkoutPageObjects;
import com.goibibo.auto.pageObjects.homePageObjects;
import com.goibibo.auto.pageObjects.paymentPageObjects;

import testData.travelerInformation;
import utilities.Base;
import utilities.Cities;


public class SS1_bookFlight extends Base
{
	@Test
	public void bookFlight() throws IOException, InterruptedException
	{
		driver=driverInitialize();
		homePageObjects homeObjects = new homePageObjects(driver);
		
		//Get the names of cities
		Cities cts = new Cities();
		String fromCity = cts.getFromCity();
		String toCity = cts.getToCity();
		
		//click on roundTrip
		homeObjects.clickOnRoundTrip();
		
		//Enter departure city
		homeObjects.getFromCityBox().sendKeys(fromCity);
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(homeObjects.getWaitLocator());
		homeObjects.getFromCityBox().sendKeys(Keys.DOWN);
		homeObjects.getFromCityBox().sendKeys(Keys.ENTER);
		
		//Enter destination city
		homeObjects.getToCityBox().sendKeys(toCity);
		wait.until(homeObjects.getWaitLocator());
		homeObjects.getToCityBox().sendKeys(Keys.DOWN);
		homeObjects.getToCityBox().sendKeys(Keys.ENTER);
		
		//Select dates
		homeObjects.clickOnDepartureDate();
		homeObjects.clickOnReturnDate();
		
		//Search for flights
		homeObjects.clickOnSearch();
		
		
		wait.until(homeObjects.getWaitForFlightLocator());
		//Sort by highest price first
		homeObjects.sortPrice();
		
		//Select flight with highest price
		homeObjects.flightSelect();
		
		
		checkoutPageObjects checkout = new checkoutPageObjects(driver);
		//Click on book flight
		checkout.clickOnBook();
		wait.until(checkout.getWaitLocator());
		checkout.clickOnRiskTrip();
		
		//enter traveler information
		checkout.clickOnTitle();
		checkout.selectNameTitle();
		checkout.getFirstNameBox().sendKeys(travelerInformation.getTravelerFirstName());
		checkout.getLastNameBox().sendKeys(travelerInformation.getTravelerLastName());
		checkout.getEmailBox().sendKeys(travelerInformation.getTravelerEmail());
		checkout.getPhoneBox().sendKeys(travelerInformation.getTravelerPhone());
		checkout.clickOnProceed();
		checkout.clickOnOkButton_covidInstructions();
		checkout.clickOnProceedToPayment();
		
		//Finish the purchase
		paymentPageObjects payment = new paymentPageObjects(driver);
		wait.until(payment.getWaitLocator());
		payment.clickOnWallets();
		
		//At this point, AmazonPay is the only option available and it is already selected and hence no user action is necessary.
		//Stopping Automation here.
		
		//mvn commandLine to be used: mvn test -DtravelerFirstName=someFirstName -DtravelerLastName=someLastName -DtravelerEmail=someEmail -DtravelerPhone=somePhoneNumber
	}
	
}
