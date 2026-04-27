package ITestListeners;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.Assert;

import Qafox.BaseTest;
import Qafox.LoginPageTest;
import Qafox.DashboardPage;

@Listeners(ITestListeners.ListenerDemo.class)
public class DashboardTests extends BaseTest {

    LoginPageTest objLogin;
    DashboardPage objDashboardPage;

    @Test(priority = 1)
    public void DasboardTest() {

        objLogin = new LoginPageTest(driver);
        objLogin.login("Admin", "admin123");

        objDashboardPage = new DashboardPage(driver);

        Assert.assertTrue(objDashboardPage.getHomePageText().contains("Dashboard"));
    }
}