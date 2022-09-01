package methodsOfWebDriver_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bike");
		Thread.sleep(2000);
		List<WebElement> webElementSuggessions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	
		for (WebElement sugg : webElementSuggessions) {
			String textOfWebelement = sugg.getText();
			Thread.sleep(1000);
			System.out.println(textOfWebelement);
		}
	}
}
