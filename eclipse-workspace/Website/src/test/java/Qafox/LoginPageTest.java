package Qafox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest{

    WebDriver driver;

    public LoginPageTest(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}