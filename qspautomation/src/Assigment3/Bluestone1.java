package Assigment3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("denyBtn")).click();
		
		String parenttab = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		for (String handle : alltabs)
		{
			if (!parenttab.equals(alltabs))
			{
				driver.switchTo().window(alltabs).
			}
		}
		
		driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		
		driver.findElement(By.id("name")).sendKeys("Mohammad Danish");
		driver.findElement(By.id("email")).sendKeys("mddanishee98@gmail.com");
//		driver.findElement(By.).click();
	}
}
