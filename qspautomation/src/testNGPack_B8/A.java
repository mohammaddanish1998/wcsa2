package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
  @Test
  public void f() {
	  // print both consol and Report
	  Reporter.log("Ye Dosti hum nahi todenge", true); 
  }
}
