package test_package;
import org.openqa.selenium.*;
import org.openqa.*;
import org.openqa.selenium.chrome.*;
public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("flipkart",Keys.ENTER);
		
		String url = "https://www.flipkart.com";
		if(url.equals(driver.getCurrentUrl())) {
			System.out.println("Success");
		}
		System.out.println("The page title is  : "+driver.getTitle());
		System.out.println("The page source : "+driver.getPageSource());
		System.out.println("The current url : "+driver.getCurrentUrl());
		
		driver.close();
		
		}

}
