package testintro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampletng3 
{
@Parameters({"URL"})
@Test
public void Weblogincarloan(String urlname )
{
System.out.println("seleniumcar");
System.out.println(urlname);
}
	
public void Weblogootcarloan()
{
System.out.println("log out");	
}

@Test(enabled=false)
public void Mobilelogincarloan()
{
 System.out.println("Appiumcar");
}
@BeforeSuite
public void bfsuite()
{
System.out.println("I am the  NO:1 ");

}

@Test(timeOut=4000)
public void MobileSignincarloan()
{
 System.out.println("AppiumSigninCar");
}

@Test
public void Mobilesignoutcarloan()
{
 System.out.println("AppiumSignoutcar");
}
@Test(dataProvider="getData")
public void Mobilepurchasecarloan(String Uname , String Pwd)
{
 System.out.println("Appiumpurchasecar");
 System.out.println(Uname);
 System.out.println(Pwd);
 
}
//trigger or invoke  testcase with data.
@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[3][2];   
	//1set
	data[0][0]="firstsetusername";
	data[0][1]="firstsetpassword";
	
	//2set
	data[1][0]="secondsetusername";
	data[1][1]="secondsetpassword";
	
	//3set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		
	return data;  //send data with values to testcase
	
	     //3 combinations dataset:
		//username & pwd : (good credit history)
		//username & pwd :(no credit history)
		//username & pwd : (fraudelent credit history)	
	
}




@Test
public void Mobilepaymentcarloan()
{
 System.out.println("Appiumpaymentcar");
}


@Test(groups= {"Smoke"})
public void  APIlogincarloan()
{
 System.out.println("Rest ApI Automationcar");
}
	
}
