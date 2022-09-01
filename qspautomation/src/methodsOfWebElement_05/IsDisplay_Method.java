package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		boolean status = loginButton.isDisplayed();
		System.out.println(status); //True
		
//		WebElement loginButton = driver.findElement(By.name("login1"));
//		boolean status = loginButton.isDisplayed();
//		System.out.println(status); NoSuchElementException because webElement not present on the webpage
	}
}
