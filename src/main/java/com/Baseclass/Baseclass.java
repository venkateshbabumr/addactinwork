package com.Baseclass;

import java.util.concurrent.TimeUnit;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
		
	
public static WebDriver getbrowser(String browserName) throws Exception {
	try {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh\\eclipse-workspace\\com.cucmber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("userdir")+"\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else {
			throw new Exception("Invalid Browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("Browser launch is the problem");
	}
}
public static void geturl(String url) {
	driver.get(url);   
}

public static boolean elementDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;

}

public static boolean elementIsEnabled(WebElement element) {
	boolean enabled = element.isEnabled();
	return enabled;

}

public static void sendKeys(String keys, WebElement element) {
	
	if (elementDisplayed(element) && elementIsEnabled(element)) {
		element.clear();
		element.sendKeys(keys);

	}
}


public static void elementvisibility(WebElement element) {
	WebDriverWait wb=new WebDriverWait(driver, 60);
	wb.until(ExpectedConditions.visibilityOf(element));
}
public static void click(WebElement element) {
	elementvisibility(element);
	element.click();
}
public static void mousehover(WebElement element)
{
	Actions ac=new Actions(driver);
	elementvisibility(element);
	ac.moveToElement(element).build().perform();
}

public static String getElementText(WebElement element) {
	elementvisibility(element);
	String text = element.getText();
	return text;
}


}

