package oprationalMethodOfDropdown_08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions_Method
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		
		 for (int i = 1; i <5; i++)
		 {
			 sel.selectByIndex(i);
		 }
		 List<WebElement> allslectedOps = sel.getAllSelectedOptions();
		 for (WebElement op : allslectedOps)
		 {
			 String text = op.getText();
			 System.out.println(text);
		 }
	 }
}
