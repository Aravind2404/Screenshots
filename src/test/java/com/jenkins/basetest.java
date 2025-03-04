package com.jenkins;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {
      WebDriver driver;
	
	@BeforeTest
	
	public void chromelaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		
	}
	@AfterTest
	
	public void teardown() {
		
		driver.close();
	}
	
	

	
	    public static void captureScreenshot(WebDriver driver, String testName) {
	        try {
	            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	            File dest = new File("./image/" + testName + "_" + timestamp + ".png");
	            FileHandler.copy(src, dest);
	            System.out.println("Screenshot taken: " + dest.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println("Exception while taking screenshot: " + e.getMessage());
	        }
	    }
	

	public WebDriver getDriver() {
		
		return driver;
	}


	
}
