package frameHandling_A3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_Bluestone { //Done
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(1000);
		
		WebElement frameElement = driver.findElement(By.id("chat-widget"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//p[contains(text(),'CHAT')]")).click();
		driver.findElement(By.id("name")).sendKeys("Mohd.Danish");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	}
}
