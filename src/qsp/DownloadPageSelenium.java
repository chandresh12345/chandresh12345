package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPageSelenium {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
}
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	Robot a=new Robot();
	a.keyPress(KeyEvent.VK_CONTROL);
	a.keyPress(KeyEvent.VK_P);
	Thread.sleep(2000);
	a.keyPress(KeyEvent.VK_TAB);
	a.keyRelease(KeyEvent.VK_TAB);

	Thread.sleep(2000);
	//a.keyPress(KeyEvent.VK_TAB);
	//a.keyRelease(KeyEvent.VK_TAB);
	//Thread.sleep(2000);
	a.keyPress(KeyEvent.VK_DOWN);

	a.keyRelease(KeyEvent.VK_DOWN);
	///Thread.sleep(2000);
	//a.keyPress(KeyEvent.VK_DOWN);
	//a.keyPress(KeyEvent.VK_DOWN);
	//a.keyPress(KeyEvent.VK_1-2);
	
	
	
}
}
