package com.FlightBookingPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//span[@data-cy='closeModal']")
	WebElement close;
	
	@FindBy(xpath="//li[@data-cy='roundTrip']")
	WebElement roundTrip;
    
    @FindBy(id="fromCity")
    WebElement sourceCity;
    
    @FindBy(xpath="//input[@aria-controls='react-autowhatever-1']")
    WebElement sourceCitySearchBox;
    
    @FindBy(id="toCity")
    WebElement destCity;
    
    @FindBy(xpath="//input[@aria-controls='react-autowhatever-1']")
    WebElement destCitySearchBox;
    
    @FindBy(xpath="//button[normalize-space()='Search']")
    WebElement searchButton;
    
    
    
    public void clickonCloseButton() throws InterruptedException
    {
    	Thread.sleep(10000);
    	close.click();
    	Thread.sleep(2000);
    }
    
    public void clickonRoundTrip() throws InterruptedException
    {
    	Thread.sleep(2000);
    	roundTrip.click();
    	Thread.sleep(2000);
    }
    
	
        
    public void enterSourceCity(String src) throws InterruptedException
    {
    	sourceCity.click();
    	Thread.sleep(2000);
    	sourceCity.sendKeys(src);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[contains(text(), '"+src+"')]")).click();
    }
    
    public void enterDestCity(String dest) throws InterruptedException
    {
    	destCity.click();
    	Thread.sleep(2000);
    	destCity.sendKeys(dest);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[contains(text(), '"+dest+"')]")).click();
    	
    }
    
    public void selectDepartureDate() throws InterruptedException
    {
    	Thread.sleep(3000);    	
    	driver.findElement(By.xpath("//div[@class='datePickerContainer']//div[@aria-label='Tue Nov 17 2026']")).click();
    	Thread.sleep(3000);    	

    }
    
    public void selectReturnDate() throws InterruptedException
    {
    	Thread.sleep(3000);    	
    	driver.findElement(By.xpath("//div[@class='datePickerContainer']//div[@aria-label='Tue Nov 24 2026']")).click();
    	Thread.sleep(3000);    	

    }
    
	
    
    public void clickonSearchButton()
    {
    	
    	searchButton.click();
    	
    }
    
	

}
