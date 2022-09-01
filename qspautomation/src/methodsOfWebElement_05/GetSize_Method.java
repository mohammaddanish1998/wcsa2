package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method { //size of webElement for ex. Login Button
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			WebElement loginButton = driver.findElement(By.name("login"));
			Dimension size = loginButton.getSize();
			int height1=size.getHeight();
			int width1=size.getWidth();
			System.out.println(height1);
			System.out.println(width1);
		}
}
