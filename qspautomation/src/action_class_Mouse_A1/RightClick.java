package action_class_Mouse_A1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement target = driver.findElement(By.xpath("//span[.='Projects']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
}
