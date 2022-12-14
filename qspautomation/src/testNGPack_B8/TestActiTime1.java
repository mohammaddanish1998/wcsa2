package testNGPack_B8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActiTime1 {
	//  execution 1)@BeforeMethod 2)@Test actiTimeLogout bcus alphabetical order   3)@AfterMethod 
	//            4)@BeforeMethod 5)@Test ActiTimeLogin 6)@afterMethod

	WebDriver driver;
	@Test
	public void logintoActiTime()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	@Test
	public void actiTimeLogout() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
	}

	@AfterMethod
	public void Closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
