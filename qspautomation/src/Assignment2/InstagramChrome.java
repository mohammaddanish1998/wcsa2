package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("md_danish__07");
		driver.findElement(By.name("password")).sendKeys("Danish@98");
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).submit();
	}
}
