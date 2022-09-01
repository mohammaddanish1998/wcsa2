package frameHandling_A3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultContent_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/fahim/Desktop/username.html");
		
		driver.findElement(By.id("un")).sendKeys("Admin");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("Manager");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("un")).clear();
	}
}
