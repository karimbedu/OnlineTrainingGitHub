package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");

		driver = new ChromeDriver();

		Thread.sleep(200);

		driver.manage().window().maximize();
		driver.manage().window().minimize();

		Thread.sleep(3000);	

		driver.get("www.google.com");

		Thread.sleep(3000);

		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
	
		driver.navigate().forward();
		
		driver.navigate().refresh();

		Thread.sleep(3000);

		driver.quit();

	}

}
