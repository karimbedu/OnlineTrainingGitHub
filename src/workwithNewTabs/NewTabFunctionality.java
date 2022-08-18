package workwithNewTabs;

import org.testng.annotations.Test;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabFunctionality {
	WebDriver driver;

	@Test
	public void newtab() throws Exception {
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.linkText("e-Catering")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/div[1]/div[1]/div/div/div/div")).click();

		driver.findElement(By.id("mobileNum")).sendKeys("9000109120");
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/div/form/input[2]")).sendKeys("kpurushotham.777@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/div/form/div[2]/button[2]")).click();
		Thread.sleep(3000);
		ArrayList<String> firstTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(firstTab.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
