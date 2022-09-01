package frameHandling_A3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_Bluestone { // Done
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("chat-widget");
		driver.findElement(By.xpath("//p[contains(text(),'CHAT')]")).click();
	}
}