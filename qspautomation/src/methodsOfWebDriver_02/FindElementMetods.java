package methodsOfWebDriver_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMetods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bike");
		
		List<WebElement> webElementSuggessions = driver.findElements(By.xpath(""));
		
		for (int i = 0; i < webElementSuggessions.size(); i++) {
			WebElement sugg = webElementSuggessions.get(i);
			
			
		}
	}

}
