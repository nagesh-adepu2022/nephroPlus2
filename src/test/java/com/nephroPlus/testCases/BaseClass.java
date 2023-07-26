package com.nephroPlus.testCases;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.nephroPlus.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String bulkDeleteURL = readconfig.getBulkDeleteURL();
	public String usernname = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();


		} 	else if (br.equals("headlesschrome")) {
			WebDriverManager.chromedriver().setup();
			

//Headless mode
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");

			// Initialize ChromeDriver with the headless option
	        driver = new ChromeDriver(chromeOptions);
		} 
		
		else if (br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		logger = logger.getLogger("nephroPlus");
		PropertyConfigurator.configure("log4j.properties");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
