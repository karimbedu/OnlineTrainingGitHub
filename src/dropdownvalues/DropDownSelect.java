package dropdownvalues;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownSelect {
	WebDriver driver;

	@Test
	public void selectdropdown() throws Exception {
		
		driver.get("http://seleniumlearn.com/program-drop-down-select-option");
		
		Thread.sleep(4000);
		
		new Select(driver.findElement(By.id("transactionType"))).selectByIndex(2);
		
	//	new Select(driver.findElement(By.id("transactionType"))).selectByValue("5");
		
	//	new Select(driver.findElement(By.id("transactionType"))).selectByVisibleText("QA");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}

}
