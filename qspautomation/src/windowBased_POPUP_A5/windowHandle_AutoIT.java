package windowBased_POPUP_A5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandle_AutoIT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).submit();
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		WebElement target = driver.findElement(By.id("photofile"));
	    Actions act = new Actions(driver);
	    act.doubleClick(target).perform();
	    
	    
	    
	}
}
