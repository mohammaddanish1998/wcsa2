package singleSelectDropdown_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedOprationException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/.drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/fahim/Desktop/Selenium/html/singleselectdropdown.html");
		WebElement cssdropdown = driver.findElement(By.id("menu"));
		
		Select sel = new Select(cssdropdown);
		sel.selectByVisibleText("misal");
		sel.deselectAll();
	}

}
