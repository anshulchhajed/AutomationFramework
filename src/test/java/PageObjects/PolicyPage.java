package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PolicyPage{

	public PolicyPage(WebDriver driver) {
		PageFactory.initElements(driver,this);  
	}

		
	
	@FindBy(linkText="Policies")
	private WebElement policy;

	@FindBy(id="new-policy-button")
	private WebElement newpolicy;
	
	@FindBy(id="btn_next")
	private WebElement policyNext;
	
	@FindBy(id="policyNameInput")
	private WebElement policyName;
	
	@FindBy(name="value(description)")
	private WebElement policydesc;
	
	@FindBy(id="policyGroup")
	private WebElement policyGrpSelect;
	

	
	
	
	public  void clickpolicy() {
		policy.click();

	}

	public void clickNewPolicy() {
		newpolicy.click();
		
	}

	public void clickNewPolicyNext() {
		policyNext.click();
		
	}
	
	public void addPolicyName(String name) {
		policyName.sendKeys(name);
		
	}
	
	public void addPolicyDescription(String name) {
		policydesc.sendKeys(name);
		
	}
	public void selectPolicyGrp(String policyGrpName) {
		Select sel=new Select(policyGrpSelect);
		sel.selectByVisibleText(policyGrpName);
		
	}
	

}
