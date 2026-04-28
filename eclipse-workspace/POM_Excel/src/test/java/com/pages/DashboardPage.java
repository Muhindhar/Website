	package com.pages;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;
	
	public class DashboardPage {
	WebDriver driver;
		
		By dashboard = By.xpath("//span[normalize-space()='Dashboard']");
		 public DashboardPage(WebDriver driver) {
		        this.driver = driver;
		    }
		public String gethompagetext() {
			return driver.findElement(dashboard).getText();
		}
	}
