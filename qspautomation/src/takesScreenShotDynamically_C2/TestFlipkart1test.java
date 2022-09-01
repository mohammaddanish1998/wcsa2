package takesScreenShotDynamically_C2;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustumListner.class)  // it is important without we can not take screenshots
public class TestFlipkart1test extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	
	@Test
	public void TestFlipkart()
	{
		Assert.fail();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
