package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTraining {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hyderabadreport.com/user");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
		
		
/*		
	List<WebElement> onlineTraining = driver.findElements(By.tagName("a"));
	System.out.println("Total Number Of Links in HydReport :" +onlineTraining.size());
	
*/	
	
	
		
		
		
		
	/*	driver.findElement(By.id("edit-name")).sendKeys("selenium"); // for id 
		
		driver.findElement(By.name("pass")).sendKeys("Admin@123"); // for name
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("form-submit")).click(); // className
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.cssSelector("input.form-submit")).click(); // cssSelector
		
	//	driver.findElement(By.cssSelector(".form-submit")).click(); //cssSelector
		
		driver.findElement(By.linkText("Photos")).click(); //linkText
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("News")).click(); //partialLinkText
		*/
	}

}
