package automation;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test (groups= {"smoke", "sanity"})
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	@Test (groups="sanity")
	public void TestC()
	{
		System.out.println("TestC");
	}
	
	@Test
	public void TestB()
	{
		System.out.println("TestB");
	}

}
