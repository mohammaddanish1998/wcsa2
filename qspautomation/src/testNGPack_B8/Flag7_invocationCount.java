package testNGPack_B8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7_invocationCount {

	@Test(invocationCount = 5)
	public void f()
	{
		Reporter.log("create and delete user", true);

	}
}
