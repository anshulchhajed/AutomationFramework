package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import PageObjects.PolicyPage;
import Utils.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class PolicySteps{


	TestContext testContext;
	PolicyPage policyPage;
	WebDriver driver;

	public PolicySteps(TestContext context) {

		testContext=context;
		policyPage=testContext.getPageObjectManager().getPolicyPage();
		driver=testContext.getWebDriverManager().getDriver();
	}

	@Then("^USer navigates to policy submenu$")
	public void navigates_to_policy_submenu() throws Throwable {
		policyPage.clickpolicy();	

	}

	@Then("^New Policy Creation Screen will appear$")
	public void new_Policy_Creation_Screen_will_appear() throws Throwable {
	

	}

	@Then("^User Clicks on new Item Link$")
	public void User_Clicks_on_new_Item_Link() throws Throwable {
		policyPage.clickNewPolicy();

		policyPage.clickNewPolicyNext();
	}

	@Then("^Configure Policy Page will appear$")
	public void Configure_Policy_Page_will_appear() throws Throwable {	
	}

	@Then("^User Enters required data to create policy$")
	public void User_Enters_required_data_to_create_policy(DataTable data) throws Throwable {
		List<List<String>>dt= data.raw();
		policyPage.addPolicyName(dt.get(0).get(0));
		policyPage.addPolicyDescription(dt.get(0).get(1));
		policyPage.selectPolicyGrp(dt.get(0).get(2));
		
	}

}