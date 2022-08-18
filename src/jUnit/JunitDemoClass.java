package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoClass {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(200);
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.quit();
	}

	@Test @Disabled
	void google() throws Exception {
		driver.get("https://www.google.com");
		}
	
	@Test
	void techlearn() throws Exception {
		driver.get("https://www.techlearn.in");
		}
	
	@Disabled // Only Junit 5
	@Test
	void fb() {
		driver.get("https://www.facebook.com");
	}
	
	@Ignore // Only for Junit 3 and 4
	@Test
	void twitter() {
		driver.get("https://www.twitter.com");
	} 

}
