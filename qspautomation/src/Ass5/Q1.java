package Ass5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	
//	close the browser child & parent without quite()

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		Thread.sleep(3000);
		String parenttab = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for (String tabs: windows)
		{
			if (!parenttab.equals(windows))
			{
				driver.switchTo().window(windows);
				
			}
		}
	}

}
