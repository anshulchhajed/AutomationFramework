@log
Feature: Test Demo Application 
 
  Scenario Outline: Test Login with valid credentials 
	  Given Open Browser and start application
    When I enter valid username and password
    |Username|Password|
    |mercury|mercury|
    And Click on Login Button
    Then User should be able to login successfuly
    Examples:  
    |anshul|chhajed|
    
   
