package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4_dependsOnMethods{
	
	@Test
	public void actiTimeLogin()
	{
		int a=7/0;
		System.out.println(a);
		Reporter.log("Login sucessful", true);
	}
	
	@Test(dependsOnMethods = "actiTimeLogin")
	public void actiTimeCreateUser()
	{
		Reporter.log("Create User", true);
	}
	
	@Test(dependsOnMethods = "actiTimeCreateUser")
	public void actiTimeLogout()
	{
		Reporter.log("Logout Sucessfull", true);
	}

}
