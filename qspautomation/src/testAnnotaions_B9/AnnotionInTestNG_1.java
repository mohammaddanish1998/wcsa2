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

public class AnnotionInTestNG_1 {
	
  @Test
  public void f()
  {
	  Reporter.log("Test Case 1 Execution", true);
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("BeforMethod Executed", true);
  }


  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AfterMethod Executed",true);
  }

  
  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("BeforeClass Executed", true);
  }

  
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("AfterClass Executed", true);
  }
  

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("BeforeTest Ececuted", true);
  }

  
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("AfterTest Executed", true);
  }

  
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("BeforeSuit Executed", true);
  }

  
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("AfterSuit Executed ",true);
  }

}
