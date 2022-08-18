package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Priority {
	WebDriver driver;
	
	@Test(priority=2)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=1)
	public void google() {
		driver.get("http://www.google.com");
	}
	
	@Test(priority=3)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=0)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}

  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
