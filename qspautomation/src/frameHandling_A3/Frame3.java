package frameHandling_A3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/fahim/Desktop/username.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("un")).sendKeys("Admin");
		
		WebElement frameElement = driver.findElement(By.id("frid"));
		Thread.sleep(3000);
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("pwd")).sendKeys("Manager");
	}
}
