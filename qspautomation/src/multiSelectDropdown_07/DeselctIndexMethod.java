package multiSelectDropdown_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselctIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		
		for (int i = 1; i <=3; i++)
		{
			sel.selectByValue("v2");
			Thread.sleep(2000);
			sel.deselectByIndex(i);
		}

		
	}

}
