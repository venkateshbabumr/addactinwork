package com.Adactin.stepdefinition;

import java.nio.channels.Selector;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;

import com.Adactin.testrunner.testrunner;
import com.Baseclass.Baseclass;
import com.pom.Checkouttestcase3;
import com.pom.Login;
import com.pom.Searchhotel;


import Helper.ConfigReader;
import Helper.PageObjectHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends Baseclass {
	public static PageObjectHelper poh=new PageObjectHelper(driver);
	public static WebDriver Driver=testrunner.driver;
	@When("^Launch the hotel reservation application using as in test data$")
	public void Launch_the_hotel_reservation_application_using_as_in_test_data() throws Throwable {
		try {
			geturl("https://adactin.com/HotelApp");
			Login l=new Login(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Driver is intialised are not");
		}
		//isDisplay(l.getLogo());
	}

	@When("^Login the hotel application using username \"([^\"]*)\" and password \"([^\"]*)\" as in test data$")
	public void Login_the_hotel_application_using_username "venkateshbabumr" and password "venkat" as  in test data(String username, String password)
			throws Throwable {
		try {
			Login l=new Login(driver);
			sendKeys(username,l.getUsername());
			sendKeys(password,l.getPassword());
			elementIsEnabled(l.getLogin());
			//singleClick(l.getLogin());
			System.out.println("Logged or sigin in successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("User name and Password is Entered are not");
		}
	}


	
	
	@When("^Select location as in test data$")
public void select_location_as_in_test_data() throws Throwable {
   
    Searchhotel s=new Searchhotel(driver);
    click(s.getLocation());
	

}
@When("^Select hotel as in test data$")
public void select_hotel_as_in_test_data() throws Throwable {
   Searchhotel s=new Searchhotel(driver);
   click(s.getHotel());
    
}

@When("^Select room type in test data$")
public void select_room_type_in_test_data() throws Throwable {
   Searchhotel s=new Searchhotel(driver);
   click(s.getRoomtype());
    
}

@When("^Select no of rooms in test data$")
public void select_no_of_rooms_in_test_data() throws Throwable {
   
   Searchhotel s=new Searchhotel(driver);
   click(s.getChildrenperroom());
}

@When("^Select the check in date is greater than check out data$")
public void select_the_check_in_date_is_greater_than_check_out_data() throws Throwable {
  Searchhotel s=new Searchhotel(driver);
 sendKeys(s.getCheckindate(), "01/12/2019");
    
}

@When("^Select the check out the date is not lower than check in date functionality$")
public void select_the_check_out_the_date_is_not_lower_than_check_in_date_functionality() throws Throwable {
   
    Searchhotel s=new Searchhotel(driver);
    sendKeys(s.getCheckinout(), "29/11/2019");
}

@When("^Select the Adults per room to check the data inside are not$")
public void select_the_Adults_per_room_to_check_the_data_inside_are_not() throws Throwable {
   
    Searchhotel s=new Searchhotel(driver);
    click(s.getAdults());
}

@When("^Select the children per room the functionality is working are not$")
public void select_the_children_per_room_the_functionality_is_working_are_not() throws Throwable {
   
    Searchhotel s=new Searchhotel(driver);
    click(s.getChildrenperroom());
}

@When("^Click the search the button is working are not$")
public void click_the_search_the_button_is_working_are_not() throws Throwable {
   Searchhotel s=new Searchhotel(driver);
   click(s.getSubmit());
    
}

@When("^click the reset the button is working are not$")
public void click_the_reset_the_button_is_working_are_not() throws Throwable {
 
    Searchhotel s=new Searchhotel(driver);
    click(s.getReset());
}
@When("^Select the check in date is lower than check out data$")
public void select_the_check_in_date_is_lower_than_check_out_data() throws Throwable {
 
	Checkouttestcase3 c=new Checkouttestcase3(driver);
	click(c.getDategreater());
}

@When("^Select the check out the date is not higher than check in date functionality$")
public void select_the_check_out_the_date_is_not_higher_than_check_in_date_functionality() throws Throwable {
 Checkouttestcase3 c=new Checkouttestcase3(driver);
 click(c.getDatelower());
}
}
