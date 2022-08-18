package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;


	@Test 
	public void TakeScreenshot() throws Exception {      
		driver.get("https://www.google.com/");
		try {                
			driver.findElement(By.name("q")).sendKeys("Vamishi + Hari + Mahesh");			
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
			}
		catch(Exception e) {      
	 
			takeScreenshot();       
		}      
	}
	
	public void takeScreenshot() throws Exception {              
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Screenshot\\OnlineBatch\\googleError.png"));
	}



	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\Venu\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
