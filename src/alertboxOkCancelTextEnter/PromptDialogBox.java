package alertboxOkCancelTextEnter;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PromptDialogBox {
	WebDriver driver;

	@Test
	public void OkorCancelAlertBox() throws Exception {
		driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Vamsi");
		a.accept();
		
	/*	
	   driver.switchTo().alert().sendKeys("Vamshi");
		driver.switchTo().alert().accept();
		*/
	}
	
	
	@Test(priority=1)
	  public void WithTime() throws Exception {
		  driver.get("https://www.youtube.com/");
		  driver.findElement(By.name("search_query")).sendKeys("cricket");
		  Thread.sleep(3000);
		  driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).clear();
		  Thread.sleep(5000);
		  driver.findElement(By.name("search_query")).sendKeys("indian cricet News"+Keys.ENTER);
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
