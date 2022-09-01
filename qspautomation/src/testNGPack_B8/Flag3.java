package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
	// if we give some method priority and   not given priority excecute first alphabetical
	
  @Test(priority = -1)
  public void validLogin()
  {
	  Reporter.log("valid login", true);
  }
  
  
  @Test(priority = 3)
  public void e()
  {
	  Reporter.log("e method",true);
  }
  
  
  @Test(priority = 1)
  public void g()
  {
	  Reporter.log("g method", true);
  }
  
  
  @Test(priority = 4)
  public void a()
  {
	  Reporter.log("a method", true);
  }
  
  
  @Test(priority = 6)
  public void f()
  {
	  Reporter.log("f method", true);
  }
  
  
  
  @Test(priority = 6)
  public void k()
  {
	  Reporter.log("k method", true);
  }
  
  
  @Test(priority = 7)
  public void s()
  {
	  Reporter.log("s method", true);
  }
  
  
  @Test
  public void v()
  {
	  Reporter.log("v method", true);
  }
  
  @Test(priority = 8)
  public void z()
  {
	  Reporter.log("z method", true);
  }
  
  
  @Test
  public void x()
  {
	  Reporter.log("x method", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
