package oprationalMethodOfDropdown_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement_Metho {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.name("menu"));
		Select sel = new Select(multiselected);
		WebElement op = sel.getWrappedElement();
		String options = op.getText();
		System.out.println(options);
	}
}
