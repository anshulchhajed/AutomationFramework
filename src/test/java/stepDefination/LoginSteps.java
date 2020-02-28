package stepDefination;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import PageObjects.LoginPage;
import Utils.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps{


	TestContext testContext;
	LoginPage login;
	WebDriver driver;

	public LoginSteps(TestContext context) {

		testContext=context;
		login=testContext.getPageObjectManager().getLoginPage();
		driver=testContext.getWebDriverManager().getDriver();
	}



	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		login.navigateTo_LoginPage();
	}


	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(List<Credentials> list) throws Throwable {
		for (Credentials credentials : list) { 
			login.enterUserName(credentials.getUsername());
			login.enterPassword(credentials.getPassword());
			login.clickSignIn();
		} 
	}


	@Then("^User navigates to Enforce Homepage$")
	public void message_displayed_Login_Successfully() throws Throwable {

	}

}
