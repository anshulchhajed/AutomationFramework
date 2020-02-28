package runner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.cucumber.listener.Reporter;

import Utils.TestContext;

public class ITestListnerImpl implements ITestListener {
TestContext testContext=new TestContext();
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		try {
			Reporter.addScreenCaptureFromPath(testContext.getScreenshot("failed"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Finished");
		testContext.getWebDriverManager().getDriver().get("file:///C:/Users/anshul_chhajed/eclipse-workspace1/automation.framework/target/cucumber-reports/report.html");
		testContext.getWebDriverManager().closeDriver();
	}

}
