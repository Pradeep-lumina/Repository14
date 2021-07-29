package automation;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_Page_Pgm {
	
	@Test
	public void logging() throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pradeep8\\Downloads\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		Logger logger = Logger.getLogger("logging");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.facebook.com/");
		logger.info("Url open successfully");
		
		Login_Page lp = new Login_Page(driver);
		
		lp.txtusername("Testing username");
		logger.info("Username entered successfully");
		Thread.sleep(2000);
		
		lp.txtpassword("Testing password");
		logger.info("Password entered successfully");
		Thread.sleep(2000);
		
		lp.btnlogin();
		logger.info("Loggedin successfully");
		
	}
}
