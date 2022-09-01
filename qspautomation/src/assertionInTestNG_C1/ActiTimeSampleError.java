package assertionInTestNG_C1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeSampleError {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1s0aojjeser66");
	}

	@Test
	public void ActiTimeTest() throws InterruptedException
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		// softassert
		sa.assertEquals(loginPageTitle, "actiTIME - LogiN");
		Reporter.log("login title is verfied", true);
		//-------------------------------------------------------------------------

		//hard assert
		boolean statusofusernameTextBox = driver.findElement(By.name("username")).isEnabled();
		Assert.assertEquals(statusofusernameTextBox, true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		//----------------------------------------------------------------------

		//hard assert
		boolean statusofpasswordTextBox = driver.findElement(By.name("pwd")).isEnabled();
		Assert.assertEquals(statusofpasswordTextBox, true);
		Reporter.log("password text box is displaed", true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//-----------------------------------------------------------------

		//hard assert
		boolean statusofLoginButton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusofLoginButton, true);
		Reporter.log("login button is displayed", true);
		driver.findElement(By.id("loginButtoNN")).click();
		//-----------------------------------------------------

		Thread.sleep(5000);
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
		sa.assertEquals(homePageTitle, "actiTIME - Enter Time-Track");

		Reporter.log("homePage title is verified",true);

		Reporter.log("create user",true);
		Reporter.log("create reports", true);
		sa.assertAll();	
	}
}
