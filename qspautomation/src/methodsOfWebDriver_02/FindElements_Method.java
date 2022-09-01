package methodsOfWebDriver_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bike");
		Thread.sleep(2000);
		
		List<WebElement> webElementSuggession = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		for (int i = 0; i < webElementSuggession.size() ; i++) {
		
			WebElement sugg = webElementSuggession.get(i);
			String textOfSugg = sugg.getText();
			Thread.sleep(1000);
			
			System.out.println(textOfSugg);	
		}
	}
}
/*  webElementSuggession
bikewale
bike on rent in pune
bike
bikedekho
bike insurance
bike rental near me
bike rental pune
bike rental hadapsar
bike price
bike loan interest rate  */