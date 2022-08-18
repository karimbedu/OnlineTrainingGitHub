package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Enabled_False_True {
	WebDriver driver;
	
	@Test(priority=2)
	public void selenium() {
		
		driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=4,enabled=true)
	public void techlearn() {
		driver.get("http://www.techlearn.in");
	}
	
	@Test(priority=1,enabled=false)
	public void google() {
		driver.get("http://www.google.com");
	}
	
	@Test(enabled=false,priority=3)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=0)
	public void twitter() throws Exception {
		driver.get("https://www.twitter.com");
		Thread.sleep(5000);
		
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
