package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest {

ChromeDriver driver;
	
	@Test(priority = 1)
	public void loginwithvalidusernameandvalidpassword() throws InterruptedException {
		
		
		
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
	public void loginwithvalidusernameandinvalidpassword() throws InterruptedException {
		
		
	
		//open login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
				
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("testpassword");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void loginwithinvalidusernameandvalidpassword() throws InterruptedException {
		
		
		
		//open login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//Enter username
		driver.findElement(By.name("username")).sendKeys("testuser");
				
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 4)
	public void loginwithinvalidusernameandinvalidpassword() throws InterruptedException {
		
		
		
		//open login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//Enter username
		driver.findElement(By.name("username")).sendKeys("testuser");
				
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("testpassword");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
}
