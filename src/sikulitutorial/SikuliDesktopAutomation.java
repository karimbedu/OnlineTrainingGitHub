package sikulitutorial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliDesktopAutomation {
	Screen s = new Screen();
	
  @Test
  public void sikuliautomation() throws FindFailed, Exception {
	  s.click("C:\\Users\\Karimbedu\\Documents\\Lib\\SikuliImages\\Windows.PNG");
	  Thread.sleep(3000);
	  s.click("C:\\Users\\Karimbedu\\Documents\\Lib\\SikuliImages\\Paint.PNG");
	  Thread.sleep(5000);
	  s.type("C:\\Users\\Karimbedu\\Documents\\Lib\\SikuliImages\\Search.PNG", "Sikuli");
	  
	  Thread.sleep(7000);
	  s.dragDrop("C:\\Users\\Karimbedu\\Documents\\Lib\\SikuliImages\\Devops.PNG", "C:\\Users\\Karimbedu\\Documents\\Lib\\SikuliImages\\Navin.PNG");
  }
}
