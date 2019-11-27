 Feature: Addactin Sample test case for Automation for Hotrel Application

 @Tc_01
Scenario: To verify  the login Details
When     Launch the hotel reservation application using as in test data
Then     Login the hotel application using username "venkateshbabumr" and password "venkat" as  in test data

 @Tc_02
 /*
  * Scenario: Login to the application uisng the user name & password & check the error  message shows are not
Given     user launch the browser and hit the Adactin homepage
When      Select location as in test data
When      Select hotel as in test data
When      Select room type in test data
When      Select no of rooms in test data
When      Select the check in date is greater than check out data
When      Select the check out the date is not lower than check in date functionality
When       Select the Adults per room to check the data inside are not
When      Select the children per room the functionality is working are not
When      Click the search the button is working are not
And       click the reset the button is working are not

@Tc_03
Scenario: Login to the application uisng the user name & password & check the error  message shows are not
Given     user launch the browser and hit the Adactin homepage
When      Login to the application using username enter the field
When      Login to the application using password enter thr field
When      Select location as in test data
When      Select hotel as in test data
When      Select room type in test data
When      Select no of rooms in test data
When      Select the check in date is lower than check out data
When      Select the check out the date is not higher than check in date functionality
  
  /*



       