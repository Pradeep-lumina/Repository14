package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample5 {
	
	@Test 
	public void TestA()
	{
		Assert.assertEquals("Google", "Google");
	}
	
	@Test (groups="sanity")
	public void TestC()
	{
		Assert.assertEquals("Gmail", "gmail");
	}
	
	@Test (groups="smoke")
	public void TestB()
	{
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
