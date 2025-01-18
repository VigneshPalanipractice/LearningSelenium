package com.orange.hrm.test1;


import org.testng.annotations.Test;

import com.orange.hrm.pages1.HomePage;
import com.report.ExtentReportUtils;

public class HomePageTest extends BaseTest{
	
	
	@Test
	public void logout() {
		HomePage homePage = new HomePage();
		
		homePage.logoutFromApplication();
		
	}

	
}
