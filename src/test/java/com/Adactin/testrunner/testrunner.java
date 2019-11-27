package com.Adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass;

import Helper.ConfigReader;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
		//plugin = {"com.cucumber.listener.ExtentCucumber.Formatter:src\\test\\resource\\com\\cucumber\\reports\\ExtendReport\\extened.html"},

		features = "src\\test\\java\\com\\Adactin\\feature\\", glue = "com.Adactin.stepdefinition", dryRun = true, strict = true, monochrome = true)
public class testrunner {
	public static WebDriver driver;

	@BeforeClass
	public static void getbrowser() throws Throwable {
		//ConfigReader cr = new ConfigReader();
		System.out.println("Browser Intialized");
		// Baseclass.getbrowser(cr.getBrowserName());
		Baseclass.getbrowser("chrome");
	}

	@AfterClass
	public  static void driverquit() {
		System.out.println("Driver Quited");
		driver.quit();
	}

}
