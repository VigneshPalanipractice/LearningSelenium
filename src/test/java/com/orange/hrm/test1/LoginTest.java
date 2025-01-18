package com.orange.hrm.test1;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages1.LoginPage;

import com.utility1.PropertiesUtility1;

public class LoginTest extends BaseTest{

	@Test
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
		//object of the login page
		
		LoginPage loginPage = new LoginPage();
			// enter password
		//loginPage.loginToApplication("Admin", "admin123");
		//get username and password from excel
		//loginPage.loginToApplication(ExcelUtility.gettestdata(1, 0),ExcelUtility.gettestdata(1,1));
		//get username and password from notepad
		loginPage.loginToApplication(PropertiesUtility1.getData("username"),PropertiesUtility1.getData("password"));
		
		 
	}
 

}
