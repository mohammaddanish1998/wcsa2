package synchronization_09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("danish");
		driver.findElement(By.name("password")).sendKeys("Danish");
		driver.findElement(By.xpath("//div[@class='K-1uj Z7p_S']")).submit();
	}
}
