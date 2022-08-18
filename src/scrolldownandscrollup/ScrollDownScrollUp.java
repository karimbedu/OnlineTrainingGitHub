package scrolldownandscrollup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownScrollUp {
	WebDriver driver;

	@Test
	public void scrollDown() throws Exception {
		driver.get("http://www.seleniumlearn.com/how-webpage-scroll-down-and-scroll-up-using-selenium-webdriver");
		Thread.sleep(5000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("scroll(0, 1500)");
	}
	
	
	@Test
	public void scrollUp() throws Exception {
		driver.get("http://www.seleniumlearn.com/how-webpage-scroll-down-and-scroll-up-using-selenium-webdriver");
		Thread.sleep(5000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("scroll(1500, 0)");
	}
	
	
	@Test (priority=6) //Indentify Loacator Element
    public void IndentifyLoacatorElement() throws Exception {
    driver.get("https://www.selenium.dev/downloads/");
   
    {
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[12]/div/div/p/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }    
      }
	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
