package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("q"));
		String attrValue = searchBox.getAttribute("title");
		System.out.println(attrValue);
		
		}
}
