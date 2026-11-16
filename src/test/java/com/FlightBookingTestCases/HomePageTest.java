package com.FlightBookingTestCases;

import java.lang.reflect.Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.FlightBookingPOM.HomePage;

public class HomePageTest {
	WebDriver driver;

	@BeforeTest
	public void launchChromeBrowser() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-quic");

		driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
	}

	@Test
	public void searchFlightTickets() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.clickonCloseButton();
		
		hm.clickonRoundTrip();
		 
		hm.enterSourceCity("Mumbai");
		hm.enterDestCity("Goa");
		hm.selectDepartureDate();
		
		hm.selectReturnDate();
		 
		hm.clickonSearchButton();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
