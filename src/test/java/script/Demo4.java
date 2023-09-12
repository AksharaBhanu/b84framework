package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo4 {

	
	
	@Test
	public void testA()
	{
		System.out.println("Executing testA....");
	}
	
	@Test
	public void testB()
	{
		System.out.println("Executing testB....");
		Assert.fail();
	}
	
	@AfterMethod
	public void am(ITestResult result) 
	{
		String n=result.getName();
		int i = result.getStatus();
		if(i==2)
		{
			
		}
		System.out.println(n+i);
		
	}
}
