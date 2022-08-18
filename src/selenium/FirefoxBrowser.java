package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\geckodriver.exe");
		driver=new FirefoxDriver();

	}

}
