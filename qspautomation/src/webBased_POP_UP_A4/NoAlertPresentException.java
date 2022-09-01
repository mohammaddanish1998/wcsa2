package webBased_POP_UP_A4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/alart.html");
		driver.findElement(By.xpath("//button[contains(text(),'Tryit')]")).click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		String text = a1.getText();
		System.out.println(text);
		
	}
}
