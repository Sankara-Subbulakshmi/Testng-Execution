package testintro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampletng4 
{
@BeforeClass
public void beforeclass()
{
	
System.out.println("Before Executing any methods in the class i execute first");
}
@AfterClass
public void afterclass()
{
	
System.out.println("After Executing any methods in the class i execute last");
}
@Test
public void WebloginHomeloan()
{
System.out.println("seleniumhome");
}
@BeforeMethod
public void beforeevery()
{
System.out.println("I will execute before every test method in sampletestng4 class");	
}
@AfterMethod
public void afterevery()
{
System.out.println("I will execute after every test method in sampletestng4 class");	
}
@Test
public void MobileloginHomeloan()
{
 System.out.println("Appiumhome");
}
@Test(groups= {"Smoke"})
public void AccessoriesLoan()
{
 System.out.println("Accessories");
}
@Test(dependsOnMethods={"ScootyLoan","WebloginHomeloan"})
public void FurinureLoan()
{
 System.out.println("Furniture");
}
@Test
public void  APIloginHomeloan()
{
 System.out.println("Rest ApI Automationhome");
}
@Test
public void ScootyLoan()
{
System.out.println("Scooty");	

}

@Parameters({"website","APIKey/username" ,"APIKey/password"})
@Test
public void ElectronicAppliance(String appname , String uname , String pwd)
{
System.out.println("Refridgerator");
System.out.println(appname);
System.out.println(uname);
System.out.println(pwd);
}





}
