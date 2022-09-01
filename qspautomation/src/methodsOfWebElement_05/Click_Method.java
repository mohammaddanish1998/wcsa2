package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import locators_03.PartialLinkText;

public class Click_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/flipkartlink.html");
		Thread.sleep(3000);
		WebElement link1 = driver.findElement(By.partialLinkText("flip"));
		link1.click();
		
	}

}
