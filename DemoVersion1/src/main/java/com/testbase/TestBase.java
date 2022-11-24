package com.testbase;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Logger logger;

	
	@BeforeClass
	public void Start()
	{
	    logger = Logger.getLogger("Dalalstreet Framework");
	    PropertyConfigurator.configure("Log4j.properties");
	    logger.info("Execution Started");
	}
	
	@AfterClass
	public void End()
	{
		logger.info("Execution End");
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		String browser ="chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter valid browser");
		}
		 logger.info("Browser Launched");
		
	    driver.get("https://apps.dalalstreet.ai/login");
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    logger.info(" Get Url and Maximize proper");
	    //-------------------obj creation-----------------------
	  
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		 logger.info("Browser Closed");
	}

}
