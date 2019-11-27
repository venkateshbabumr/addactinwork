package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	
	public Login(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@id='username']")
private WebElement username;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public void setLogin(WebElement login) {
	this.login = login;
}

@FindBy(xpath="//input[@id='password']")
private WebElement password;


@FindBy(xpath="//input[@id='login']")
private WebElement login;
}
