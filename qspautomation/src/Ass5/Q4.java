package Ass5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {  // Done
	
//	How to close only child browser
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		
		String parenthandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		for (String handle : allhandles)
		{
			if (!parenthandle.equals(handle))
			{
				Thread.sleep(2000);
				driver.switchTo().window(handle).close();
			}
			
		}
	}
}
