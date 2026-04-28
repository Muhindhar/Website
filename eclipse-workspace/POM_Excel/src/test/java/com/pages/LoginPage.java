package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
WebDriver driver;
	
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By titletext = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	By login = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String strusername) {
		driver.findElement(username).sendKeys(strusername);
	}
	public void setpassword(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
	}
	public void clicklogin() {
		driver.findElement(login).click();
	}
	public String gettitle() {
		return driver.findElement(titletext).getText();
	}
	
	public void login(String strusername,String strpassword) {
		this.setUserName(strusername);
		this.setpassword(strpassword);
		this.clicklogin();
	}

}
