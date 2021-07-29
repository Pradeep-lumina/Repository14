package automation;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test (groups="sanity")
	public void login()
	{
		System.out.println("Login Successful");
	}
	
	@Test (groups="smoke")
	public void search()
	{
		System.out.println("Search Successful");
	}
	
	@Test (priority=2)
	public void Advancesearch()
	{
		System.out.println("Advance search Successful");
	}
	
	@Test (priority=4)
	public void logout()
	{
		System.out.println("Logout Successful");
	}


}
