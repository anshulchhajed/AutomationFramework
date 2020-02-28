package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Managers.FileReaderManager;

public class LoginPage{
WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);  
	}

	@FindBy(id="username")
	private WebElement usame;

	@FindBy(id="password")
	private WebElement pswd;

	@FindBy(id="login-link")
	private WebElement login;
	
	@FindBy(id="manage")
	private WebElement manageDropdown;

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
	

	
	public void enterUserName(String user) {
		usame.sendKeys(user);
		
	}

	public  void enterPassword(String pass) {
		pswd.sendKeys(pass);

	}
	
	public  void clickManage() {
		manageDropdown.click();

	}
	
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
	
	 public void navigateTo_LoginPage() {
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		 }
	public  void clickSignIn() {
		login.click();
	}
	
	//Binding- Methods
	public void loginApplication(String user,String pass) {
		enterUserName(user);
		enterPassword(pass);
		clickSignIn();
	}

}
