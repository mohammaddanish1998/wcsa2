package Ass5; //Done

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		String parentTab = driver.getWindowHandle();
		
		Set<String> childTab = driver.getWindowHandles();
		for (String tab : childTab) 
		{
		if (!parentTab.equals(tab))
			{
				driver.switchTo().window(tab);
			}
		}
			
			driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='_1fGeJ5' and .='256 GB']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Remove']")).click();
			}	
	}
