package xpathLocator_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		WebElement usernameTexbox = driver.findElement(By.id("txtUsername"));
		usernameTexbox.sendKeys("admin");
		Thread.sleep(2000);
		usernameTexbox.clear();
	}
}
