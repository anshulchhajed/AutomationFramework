package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import Managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature",	
		glue="stepDefination",
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		//plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/cucumber.json"},
		//plugin= {"pretty","html:target/cucumber-html-report"},		
		monochrome=true,  //Display the console output in proper readable format.
		//strict=false,     //It will check if any step is not  defined in step defination file
		//dryRun=false  ,  // To check the mapping is proper between feature file and step defination file

		tags={"@filesystemTest,@SharepointTest,@Remediation"}

		)
public class TestRunner extends AbstractTestNGCucumberTests{

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("OS", System.getProperty("os.name"));
		Reporter.setSystemInfo("Java Version",System.getProperty("java"));
		Reporter.setSystemInfo("Test Suite", "File System");
		Reporter.setSystemInfo("Machine IP",FileReaderManager.getInstance().getConfigReader().getMachineIP());
		Reporter.setSystemInfo("DLP Build Version", "15.7.0.16002");
	}
}
