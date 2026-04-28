package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;
public class LoginTest extends BaseTest {
  @Test
  public void logintest() {
	  objLogin = new LoginPage(driver);
	  String logintit = objLogin.gettitle();
	  Assert.assertTrue(logintit.contains("Login"), "Login title mismatch");
	    System.out.println("Login test passed");
  }
}
