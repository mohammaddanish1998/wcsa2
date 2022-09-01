package PRACTICE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MousrPressAndRelease {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouseP = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		Robot act = new Robot();
		act.mousePress(InputEvent.BUTTON1_MASK);
		act.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		
	}
}
