package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect_Method {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			WebElement loginButton = driver.findElement(By.name("login"));
			Rectangle rect = loginButton.getRect();
			rect.getWidth();
			rect.getHeight();
			rect.getX();
			rect.getY();
			System.out.println("Width :"+rect.getWidth());
			System.out.println("Height :"+rect.getHeight());
			System.out.println("X-axis :"+rect.getY());
			System.out.println("Y-axis :"+rect.getX());
		}
}
