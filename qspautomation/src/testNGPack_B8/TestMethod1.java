package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 { //parallely Executed created xml file select  parallel Mode ex.Methods, classes, tests 

	@Test
	public void method1()
	{
		Reporter.log("method1 "+Thread.currentThread().getId(),true);
	}

	@Test
	public void method2()
	{
		// thread.currentthread it used to get thread id 
		Reporter.log("method2 "+Thread.currentThread().getId(),true); 
	}

}
