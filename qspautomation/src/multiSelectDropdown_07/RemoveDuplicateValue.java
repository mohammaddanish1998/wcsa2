package multiSelectDropdown_07;//Done

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/multiselectdropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement multi = driver.findElement(By.name("menu"));
		
		Select sel = new Select(multi);
		
		List<WebElement> allops = sel.getOptions();
		
		TreeSet<String> t=new TreeSet<String>();
//		HashSet<String> t=new HashSet<String>();
		
		for (int i = 0; i < allops.size(); i++)
		{
			String text = allops.get(i).getText();
			t.add(text);
		}
		for (String s : t) 
		{
			System.out.println(s);
		}
	}
}
