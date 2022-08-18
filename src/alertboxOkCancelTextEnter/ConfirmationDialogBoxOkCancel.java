package alertboxOkCancelTextEnter;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ConfirmationDialogBoxOkCancel {
	WebDriver driver;

	@Test
	public void OkorCancelAlertBox() throws Exception {
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		 		
		driver.switchTo().alert().dismiss();
		
		//driver.switchTo().alert().accept();
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
