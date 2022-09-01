package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTest_FlagPrio { // Run as testNG Test 
	
  @Test(priority = 1)
  public void loginActiTime()
  {
	  Reporter.log("login ActiTime", true);
  }
  
  @Test(priority = 2)
  public void createUser()
  {
	  Reporter.log("Create User", true);
  }
  
  @Test(priority = 3)
  public void logoutActiTime()
  {
	  Reporter.log("logout ActiTime", true);
  }
}
