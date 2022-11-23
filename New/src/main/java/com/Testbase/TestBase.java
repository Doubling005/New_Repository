package com.Testbase;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.mongodb.diagnostics.logging.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;

	@BeforeMethod
	public void setup() {

		String browser = "CHROME";
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please provide Valid Browser name");
		} 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
	
	@BeforeClass
	public void start() {
//		logger = Logger.getLogger("MoneyBhaiFramework");
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterClass
	public void end() {
		logger.info("Execution End");
	}
	
	 
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
	
	

}
