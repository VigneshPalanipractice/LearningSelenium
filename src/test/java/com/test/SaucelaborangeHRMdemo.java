package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucelaborangeHRMdemo {

	RemoteWebDriver driver;
	
	@Test(priority = 1)
	public void login() throws InterruptedException, MalformedURLException {
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap();
		sauceOptions.put("username", "oauth-vignesh.palani100-25162");
		sauceOptions.put("accessKey", "3b7c8ce1-829b-466f-bbbc-eb60263dc43a");
		sauceOptions.put("build", "selenium-build-HE78I");
		sauceOptions.put("name", "<your test name>");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		// start the session
		@SuppressWarnings("deprecation")
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		 driver = new RemoteWebDriver(url, browserOptions);

		// run commands and assertions
		driver.get("https://saucedemo.com");
		String title = driver.getTitle();
		boolean titleIsCorrect = title.contains("Swag Labs");
		String jobStatus = titleIsCorrect ? "passed" : "failed";

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		
		
		
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
		driver.quit();
}
}
	

