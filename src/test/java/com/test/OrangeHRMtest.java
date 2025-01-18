package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMtest {

ChromeDriver driver;
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		
		//open chrome
		driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
				
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void testAdmin() {
		//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	boolean isdisplayed=driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
	
	Assert.assertTrue(isdisplayed);
	}
	
	@Test(priority = 3)
	public void logout() {
		//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
