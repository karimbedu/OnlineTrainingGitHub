package advancedSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class GetTitle {
	WebDriver driver;

	@Test
	public void verifyWebTitle() {
		driver.get("https://www.flipkart.com");
		
		String exp = "Flipkart";
		String act = driver.getTitle();
		System.out.println(act);
		
		Assert.assertEquals(exp, act);		
	}
	
	@Test
	public void verifyURL() {
		
		driver.get("https://www.google.com");
		
		String exp = "https://www.google.com/";		
		System.out.println("Expected Result is : "+exp);
		
		
		String act = driver.getCurrentUrl();
		System.out.println("Actual Result is : "+act);
		
		Assert.assertEquals(act, exp);
		
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
