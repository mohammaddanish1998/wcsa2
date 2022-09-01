package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	
	@Test
	public void method3()
	{
		Reporter.log("Method3", true);
		int a=1/0;
		System.out.println(a);
	}
}
