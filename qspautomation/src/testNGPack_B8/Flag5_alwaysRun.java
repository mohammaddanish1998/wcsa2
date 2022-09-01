package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5_alwaysRun { 
	
	@Test
	public void actiTimeLogin()
	{
		int i=6/0;
		System.out.println(i);
		Reporter.log("Login Succesful", true);
	}
	
	@Test(dependsOnMethods = "actiTimeLogin")
	public void actiTimeCreateUser()
	{
		Reporter.log("create user", true);
	}
	
	@Test(dependsOnMethods = "actiTimeCreateUser", alwaysRun = true)
	public void actiTimeLogout()
	{
		Reporter.log("Logout sucessful");
	}
}
