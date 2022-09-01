package screenShot_A6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2_RemoteWebdriverClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		
		Thread.sleep(2000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshots/screenshot2.jpg");
		
		Files.copy(src, des);
	}
}
