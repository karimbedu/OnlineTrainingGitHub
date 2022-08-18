package screenshot;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class TimeFormatScreenshot {
	WebDriver driver;

	public void Screenshot() throws IOException {
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = df.format(date);
	
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Screenshot\\OnlineBatch\\Screen_" + time + ".png"));
		}

	@Test
	public void seleniumlearn() throws Exception {
		driver.get("http://seleniumlearn.com");
		Thread.sleep(6000);
		Screenshot();
	}
	
	@Test
	public void twitter() throws Exception {
		driver.get("https://twitter.com");
		Thread.sleep(2000);
		Screenshot();
	}
	
	@Test
	public void google() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(2000);
		Screenshot();		
		driver.findElement(By.name("q")).sendKeys("Vinayaka Chavithi in 2022");
		Screenshot();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Screenshot();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\Venu\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
