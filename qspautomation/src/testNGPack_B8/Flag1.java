package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
  @Test(description = "This is used to performed a valid login") //description flag
  public void validActiTimeTest()
  {
	  Reporter.log("valid login is performed", true);
  }
  
  @Test(description = "This is used to performed a invalid login")
  public void invalidActiTimeTest()
  {
	  Reporter.log("invalid login is performed", true);
  }
}
