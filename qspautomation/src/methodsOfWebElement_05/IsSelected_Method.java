package methodsOfWebElement_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/checkbox.html");
		WebElement AutomationCheckBox = driver.findElement(By.id("automation"));
		boolean status = AutomationCheckBox.isSelected();
		System.out.println(status);// false 
		
//		WebElement AutomationCheckBox = driver.findElement(By.id("automation"));
//		AutomationCheckBox.click();
//		boolean status = AutomationCheckBox.isSelected();
//		System.out.println(status); --->> True because automation checkbox is selected
		
	}
}
