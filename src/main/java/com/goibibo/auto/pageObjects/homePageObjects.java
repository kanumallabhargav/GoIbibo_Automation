package com.goibibo.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class homePageObjects 
{
	//Initialize a driver
	WebDriver driver;
	
	//WebElements
	private By roundTrip = By.id("roundTrip");
	private By fromCity = By.id("gosuggest_inputSrc");
	private By toCity = By.id("gosuggest_inputDest");
	private ExpectedCondition<WebElement> waitLocator = ExpectedConditions.visibilityOfElementLocated(By.id("react-autosuggest-1"));
	private By departureDate = By.id("fare_20200812");
	private By returnDate = By.id("fare_20200819");
	private By search = By.id("gi_search_btn");
	private By sort = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div/ul/li[4]/span/span");
	private By selectFlight = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div/div[1]/div/div[2]/div[2]/div/span[2]/label");
	private ExpectedCondition<WebElement> waitForFlightLocator = ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div/div[1]/div/div[2]"));
	//Constructor to give life to the WebDriver object
	public homePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Methods to access the webElements
	public void clickOnRoundTrip()
	{
		driver.findElement(roundTrip).click();
	}
	public WebElement getFromCityBox()
	{
		return driver.findElement(fromCity);
	}
	public WebElement getToCityBox()
	{
		return driver.findElement(toCity);
	}
	public ExpectedCondition<WebElement> getWaitLocator()
	{
		return waitLocator;
	}
	public void clickOnDepartureDate()
	{
		driver.findElement(departureDate).click();
	}
	public void clickOnReturnDate()
	{
		driver.findElement(returnDate).click();
	}
	public void clickOnSearch()
	{
		driver.findElement(search).click();
	}
	public void sortPrice()
	{
		driver.findElement(sort).click();
	}
	public void flightSelect()
	{
		driver.findElement(selectFlight).click();
	}
	public ExpectedCondition<WebElement> getWaitForFlightLocator()
	{
		return waitForFlightLocator;
	}
}
