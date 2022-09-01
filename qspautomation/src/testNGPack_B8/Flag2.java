package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 { // one test script disabled other 2 script excecute and report
	
  @Test(enabled = false) // This test will not run itself..... It is disabled !
  public void method1()
  {
	  Reporter.log("actiTime valid",true );
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("ActiTime create user", true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("ActiTime create Report", true);
  }
}
