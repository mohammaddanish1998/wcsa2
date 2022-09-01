package PRACTICE;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/fahim/Desktop/Selenium/html/multiselectdropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement multis = driver.findElement(By.name("menu"));
		Select sel = new Select(multis);
		
	    List<WebElement> allops = sel.getAllSelectedOptions();
	    
	    TreeSet<String> s=new TreeSet<String>();
	    
	    for (int i = 0; i <=allops.size(); i++) 
	    {
	    	WebElement op = allops.get(i);
	    	String text = op.getText();
	    	s.add(text);
		}
	    System.out.println(s);
	}
}
