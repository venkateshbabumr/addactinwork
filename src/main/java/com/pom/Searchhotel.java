package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Searchhotel {
	public static WebDriver driver;
	//public static WebDriver Driver=testrunner.driver;
	public Searchhotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//option[@value='Sydney']")
	private WebElement location;
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckinout() {
		return checkinout;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildrenperroom() {
		return childrenperroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getReset() {
		return reset;
	}
	@FindBy(xpath="//option[@value='Hotel Creek']")
	private WebElement hotel;
	
	@FindBy(xpath="//option[@value='Standard']")
	private WebElement roomtype;
	
	@FindBy(xpath="(//option[@value='1'])[1]")
	private WebElement noofrooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkindate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkinout;
	
	@FindBy(xpath="(//option[text()='1 - One'])[2]")
	private WebElement adults;
	
	@FindBy(xpath="(//option[@value='1'])[3]")
	private WebElement childrenperroom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//input[@type='reset']")
	private WebElement reset;
	
	
	


}
