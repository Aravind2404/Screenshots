package com.jenkins;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class Testclass extends basetest{
	

	@Test( testName ="orangehrmlogin" )
	public void orangehrmlogin() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		
		
//		String Actualtitle =driver.getTitle();
//		String Expectedtitle ="";
//		Assert.assertEquals(Actualtitle , Expectedtitle, "title is mismatched");
	}
	
	@Test( testName = "myjobbieelogin")
	public void myjobbieelogin() throws InterruptedException {
		driver.get("https://www.myjobbie.com/sign-in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Aravindm641@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gthwersd23@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//        String Actualtitle =driver.getTitle();
//		String Expectedtitle ="sss-in";
//		Assert.assertEquals(Actualtitle , Expectedtitle, "title is mismatched");
//		
		Thread.sleep(2000);
	}
//	
//	@Test(priority =3)
//	public void facebooklogin() throws InterruptedException {
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aravind24");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asdfwetf");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();	
//		String Actualtitle =driver.getTitle();
//		String Expectedtitle ="facebooktitleisfail";
//		Assert.assertEquals(Actualtitle , Expectedtitle, "title is mismatched");
//	}
}
