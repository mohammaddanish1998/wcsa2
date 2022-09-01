package webBased_POP_UP_A4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Popup_Dismiss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-strat-maximized");
		ChromeDriver driver = new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/alart.html");
		driver.findElement(By.xpath("//button[contains(text(),'Tryit')]")).click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.dismiss();
	
	}
}
