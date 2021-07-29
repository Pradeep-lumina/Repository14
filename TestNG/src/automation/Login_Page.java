package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(how=How.ID, using="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	Login_Page(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void txtusername(String name)
	{
		username.sendKeys(name);
	}
	
	public void txtpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void btnlogin()
	{
		login.click();
	}
}
