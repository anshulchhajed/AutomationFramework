package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.cucumber.listener.Reporter;

import PageObjects.HomePage;
import Utils.TestBase;
import Utils.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class HomeSteps{


	TestContext testContext;
	HomePage homepage;
	WebDriver driver;

	public HomeSteps(TestContext context) {

		testContext=context;
		homepage=testContext.getPageObjectManager().getHomePage();
		driver=testContext.getWebDriverManager().getDriver();
	}

	@Then("^User navigates to manage menu$")
	public void message_displayed_Login_Successfully() throws Throwable {
		homepage.clickManage();

	}

}
