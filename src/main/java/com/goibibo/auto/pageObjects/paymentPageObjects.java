package com.goibibo.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class paymentPageObjects 
{
	//Initialize a driver
		WebDriver driver;
		
		//Elements
		private ExpectedCondition<WebElement> waitLocator = ExpectedConditions.visibilityOfElementLocated(By.id("tab_wallet"));
		private By walletsOption = By.id("tab_wallet");
		
		
		//Constructor to give life to the WebDriver Object
		public paymentPageObjects(WebDriver driver)
		{
			this.driver = driver;
		}
		public ExpectedCondition<WebElement> getWaitLocator()
		{
			return waitLocator;
		}
		public void clickOnWallets()
		{
			driver.findElement(walletsOption).click();
		}
		
}
