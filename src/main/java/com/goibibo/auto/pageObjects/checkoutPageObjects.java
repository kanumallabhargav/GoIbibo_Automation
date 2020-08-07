package com.goibibo.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class checkoutPageObjects 
{
	//Initialize a driver
		WebDriver driver;
		
		//WebElements
		private By bookButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/span[2]/span/input");
		private ExpectedCondition<WebElement> waitLocator = ExpectedConditions.visibilityOfElementLocated(By.id("risk-trip"));
		private By riskTripRadio = By.id("risk-trip");
		private By nameTitle = By.id("Adulttitle1");
		private By titleSelect = By.xpath("//*[@id=\"Adulttitle1\"]/option[2]");
		private By firstNameBox = By.id("AdultfirstName1");
		private By lastNameBox = By.id("AdultlastName1");
		private By emailBox = By.id("email");
		private By phoneBox = By.id("mobile");
		private By proceedButton = By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[1]/div[4]/div/form/div[2]/button");
		private By acceptCovid19_instructions = By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[1]/div[5]/div[1]/div[2]/div/div/div[7]/button");
		private By proceedToPaymentButton = By.xpath("//*[@id=\"addonCard\"]/button");
		
		
		//Constructor to give life to the WebDriver Object
		public checkoutPageObjects(WebDriver driver)
		{
			this.driver = driver;
		}
		
		//Methods to access the elements
		public void clickOnBook()
		{
			driver.findElement(bookButton).click();
		}
		public ExpectedCondition<WebElement> getWaitLocator()
		{
			return waitLocator;
		}
		public void clickOnRiskTrip()
		{
			driver.findElement(riskTripRadio).click();
		}
		public WebElement getFirstNameBox()
		{
			return driver.findElement(firstNameBox);
		}
		public WebElement getLastNameBox()
		{
			return driver.findElement(lastNameBox);
		}
		public void clickOnTitle()
		{
			driver.findElement(nameTitle).click();
		}
		public void selectNameTitle()
		{
			driver.findElement(titleSelect).click();
		}
		public WebElement getEmailBox()
		{
			return driver.findElement(emailBox);
		}
		public WebElement getPhoneBox()
		{
			return driver.findElement(phoneBox);
		}
		public void clickOnProceed()
		{
			driver.findElement(proceedButton).click();
		}
		public void clickOnOkButton_covidInstructions()
		{
			driver.findElement(acceptCovid19_instructions).click();
		}
		public void clickOnProceedToPayment()
		{
			driver.findElement(proceedToPaymentButton).click();
		}
}
