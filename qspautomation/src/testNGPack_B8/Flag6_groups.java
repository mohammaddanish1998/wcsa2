package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6_groups {
	
  @Test(groups = "FUNCTIONAL")
  public void ft1()
  {
	  Reporter.log("functional test case 1",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it1()
  {
	  Reporter.log("integration test case 1",true);
  }
  
  @Test(groups = "SMOKE")
  public void st1()
  {
	  Reporter.log("smoke test case 1",true);
  }
  
 //-------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft2()
  {
	  Reporter.log("functional test case 2",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it2()
  {
	  Reporter.log("integration test case 2",true);
  }
  
  @Test(groups = "SMOKE")
  public void st2()
  {
	  Reporter.log("smoke test case 2",true);
  }
 //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft3()
  {
	  Reporter.log("functional test case 3",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it3()
  {
	  Reporter.log("integration test case 3",true);
  }
  
  @Test(groups = "SMOKE")
  public void st3()
  {
	  Reporter.log("smoke test case 3",true);
  }
 //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft4()
  {
	  Reporter.log("functional test case4",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it4()
  {
	  Reporter.log("integration test case 4",true);
  }
  
  @Test(groups = "SMOKE")
  public void st4()
  {
	  Reporter.log("smoke test case 4",true);
  }
  
 //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft5()
  {
	  Reporter.log("functional test case 5",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it5()
  {
	  Reporter.log("integration test case 5",true);
  }
  
  @Test(groups = "SMOKE")
  public void st5()
  {
	  Reporter.log("smoke test case 5",true);
  }
 //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft6()
  {
	  Reporter.log("functional test case 6",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it6()
  {
	  Reporter.log("integration test case 6",true);
  }
  
  @Test(groups = "SMOKE")
  public void st6()
  {
	  Reporter.log("smoke test case 6",true);
  }
  
}
