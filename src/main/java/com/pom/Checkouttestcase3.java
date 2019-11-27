package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkouttestcase3 {
public static WebDriver driver;
public Checkouttestcase3(WebDriver ldriver) {
   this.driver=ldriver;
   PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='datepick_in']")
private WebElement dategreater;
public WebElement getDategreater() {
	return dategreater;
}
public WebElement getDatelower() {
	return datelower;
}
@FindBy(xpath="//input[@id='datepick_out']")
private WebElement datelower;

}
