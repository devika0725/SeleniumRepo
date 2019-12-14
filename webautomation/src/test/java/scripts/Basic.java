package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic {
	
		
@Test

public void test()
{
	System.setProperty("webdriver.chrome.driver", "D:\\devika\\Automation\\Selenium jars\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.gmail.com");
	
}
	
	
	

}
