package Selenium_TestNg_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void loginTest() {
	  driver.findElement(By.xpath("//a[@id='login2']")).click();
	  WebElement name =  driver.findElement(By.xpath("//input[@id='loginusername']"));
	  name.sendKeys("admin");
	  WebElement ps =   driver.findElement(By.xpath("//input[@id='loginpassword']"));
	  ps.sendKeys("admin");
	  WebElement btn = driver.findElement(By.xpath("//button[text()='Log in']"));
	  btn.click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions op = new ChromeOptions();
	  op.addArguments("--start-maximixed");
	  op.addArguments("--headless");
	  driver = new ChromeDriver(op);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoblaze.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
