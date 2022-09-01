package webBased_POP_UP_A4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Max_Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("-start-maximized");
		
		WebDriver driver=new FirefoxDriver(fo);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
	}
}