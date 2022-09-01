package testAnnotaions_B9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsIntestNG_2 {
	
  @Test
  public void f() 
  {
	  Reporter.log("Test case 1 Execution", true);
  }
  
  @Test
  public void f2()
  {
	  Reporter.log("Test case 2 Execution", true);
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("beforeMethod Executed", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("afterMethod Executed",true);
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("beforeClass Executed",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("afterClass Executed",true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("beforeTest Executed",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("afterTest Executed",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("beforeSuit Executed",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("afterSuit Executed",true);
  }

}
