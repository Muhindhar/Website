package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utilities.ExcelData;

public class DashboardTest extends BaseTest {

    @Test(dataProvider = "InvalidData", dataProviderClass = ExcelData.class)
    public void dashboard(String username, String password) {

        LoginPage objLogin = new LoginPage(driver);
        objLogin.login(username, password);

        System.out.println("Logged In with: " + username);
        
        DashboardPage objDashboardPage = new DashboardPage(driver);

        Assert.assertTrue(
            objDashboardPage.gethompagetext().contains("Dashboard"),
            "Dashboard not displayed"
        );
    }
}