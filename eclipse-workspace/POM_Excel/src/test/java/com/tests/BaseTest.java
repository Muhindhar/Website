package com.tests;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class BaseTest {
	public static WebDriver driver;
	LoginPage objLogin;
	DashboardPage objDashboardPage;
	public static Logger log = LogManager.getLogger(BaseTest.class);
  
  @BeforeMethod
  public void setup() {
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(opt); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  log.info("Logging IN");
  }
  @AfterMethod
  public void afterClass() {
	  driver.quit(); 
	  log.info("Website closing");
  }

}
