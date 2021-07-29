package automation;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void login_page() throws InterruptedException
	{
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pradeep8\\Downloads\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		Logger logger = Logger.getLogger("login_page");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.facebook.com/");
		logger.info("Url open successful");
		
		Reg_Page RP = new Reg_Page(driver);
					
		RP.set_username("Testing username");
		logger.info("Username enter successful");
		Thread.sleep(2000);
		
		RP.set_password("Testing password");
		logger.info("Password enter successful");
		Thread.sleep(2000);
		
		RP.btn_login();
		logger.info("Login button successful");
	}

}
