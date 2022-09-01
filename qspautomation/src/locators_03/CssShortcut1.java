package locators_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssShortcut1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name^='u']")).sendKeys("Danish");
		driver.findElement(By.cssSelector("input[name^='pas']")).sendKeys("Loading");
		
		//shortcut starting use ^ charachter ex.password ==pas or username == u
	}

}
