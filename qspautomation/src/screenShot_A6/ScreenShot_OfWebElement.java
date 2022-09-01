package screenShot_A6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot_OfWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[.='Log In']"));
		File src = LoginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/scrnshotOfWebElement.jpg");
		Files.copy(src, dest);
		
		
	}
}
