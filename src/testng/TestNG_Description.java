package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Description {
	WebDriver driver;
	
	@Test(priority=2,description="Selenium website")
	public void testcase_1() {
		
		driver.get("https://www.selenium.dev");
	}
	
	@Test(description="techlearn website",priority=4,enabled=true)
	public void testcase_2() {
		driver.get("http://www.techlearn.in");
	}
	
	@Test(priority=1,description="Selenium website",enabled=false)
	public void testcase_3() {
		driver.get("http://www.google.com");
	}
	
	@Test(enabled=false,priority=3,description="google website")
	public void testcase_4() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=0)
	public void testcase_5() throws Exception {
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
