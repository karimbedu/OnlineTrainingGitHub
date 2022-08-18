package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;

	@Test
	public void log4j() throws Exception {
		Logger log = Logger.getLogger("Google Application");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome Borwser Launched");
		
		driver.manage().window().maximize();
		log.info("Browser window maximized");
		
		driver.get("https://www.google.com");
		log.info("google application url entered");
		
		driver.findElement(By.name("q")).sendKeys("Log4j Tutorial");
		log.info("Log4j tutorial entered in google search field");
		
		Thread.sleep(3000);
		log.info("It will wait for 3 seconds");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed from keyboard");
		
		Thread.sleep(2000);
		log.info("It will wait for 2 seconds");
		
		driver.close();
		log.info("Browser window closed");
		
		
	}
}
