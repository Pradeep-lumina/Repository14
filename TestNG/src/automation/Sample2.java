package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {

		@Test (groups="sanity")
		public void TestA()
		{
			Assert.assertEquals("Google", "Google");
		}
		
		@Test (groups="smoke")
		public void TestC()
		{
			Assert.assertEquals("Gmail", "gmail");
		}
		
		@Test
		public void TestB()
		{
			Assert.assertEquals("Yahoo", "Yahoo");
		}

	

}
