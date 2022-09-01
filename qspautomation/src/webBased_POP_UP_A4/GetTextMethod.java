package webBased_POP_UP_A4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/confirmation.html");
		driver.findElement(By.xpath("//button[contains(text(),' I am a')]")).click();
		
		Alert c1 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = c1.getText();
		System.out.println(text);
	}

}
