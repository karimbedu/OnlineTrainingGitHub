package sikulitutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliDemo {
	Screen s = new Screen();
	WebDriver driver;
	

	@Test
	public void withOutSikuli() throws InterruptedException, FindFailed {
		driver.get("http://seleniumlearn.com");
		Thread.sleep(5000);
		s.click("C:\\Users\\Karimbedu\\Documents\\Lib\\sikuli\\Mysql.PNG");
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
