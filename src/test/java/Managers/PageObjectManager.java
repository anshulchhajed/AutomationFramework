package Managers;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PolicyPage;

public class PageObjectManager {


	 private WebDriver driver;
	 
	 private HomePage homePage;
	 
	 private LoginPage loginPage;
	 
	 private PolicyPage policyPage;
	 
	 
	 public PageObjectManager(WebDriver driver) {
	 
	 this.driver = driver;
	 
	 }
	 
	 
	 
	 public HomePage getHomePage(){
	 
	 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	 
	 }
	 
	 
	 public LoginPage getLoginPage() {
	 
	 return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	 
	 }
	 
	 public PolicyPage getPolicyPage(){
		 
		 return (policyPage == null) ? policyPage = new PolicyPage(driver) : policyPage;
		 
		 }
		 
	}

