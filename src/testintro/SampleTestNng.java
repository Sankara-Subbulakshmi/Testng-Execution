package testintro;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SampleTestNng {

	//can define multiple testcases from single class.
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	@Test()
	public void Demo()
	{
	System.out.println("hello");
	Assert.assertTrue(false); // tc fail
	}
	@AfterSuite
	public void afsuite()
	{
		
		System.out.println("I am the NO : 1 from  Last");
	}
   @Test()
  public void secondtc()
  {
	   System.out.println("bye");
  }
  
   @Test(groups= {"Smoke"})
   public void trial()
   {
 	   System.out.println("check it out");
   }
   
   
   
}
