package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev");
			Thread.sleep(2000);
			
			WebElement web1 = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
			String textOfWeb = web1.getText();
			System.out.println(textOfWeb);
		}
}
