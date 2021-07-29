package automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_Page {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	Reg_Page(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void set_username(String name)
	{
		username.sendKeys(name);
	}
	
	public void set_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void btn_login()
	{
		login.click();
	}
}
