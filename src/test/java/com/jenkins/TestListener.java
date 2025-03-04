package com.jenkins;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends basetest implements ITestListener {

	public void onTestFailure(ITestResult result) {
		Object testClass = result.getInstance();
        WebDriver driver = ((basetest) testClass).getDriver();
        basetest.captureScreenshot(driver, result.getName());
	}
  
   
    
}
