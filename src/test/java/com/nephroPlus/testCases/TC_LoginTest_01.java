package com.nephroPlus.testCases;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.nephroPlus.pageObjects.LoginPage;
public class TC_LoginTest_01 extends BaseClass {
		@Test
	public void loginTest() {
//			WebDriverManager.chromedriver().setup();
//
//	        // Create an instance of WebDriver
//	    
//			driver = new ChromeDriver();
		driver.get(baseURL);
		logger.info("URL Opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(usernname);
		lp.setPassword(password);
		lp.ClickOnSubmit();
		if(driver.getTitle().equals("Dashboard | NephroPlus Backoffice")) {
			Assert.assertTrue(true);
			logger.info("Log in Success");
			
		}else {
			Assert.assertTrue(false);
			logger.info("Login Failed");
		}
		System.out.println(driver.getTitle());
	}

}
