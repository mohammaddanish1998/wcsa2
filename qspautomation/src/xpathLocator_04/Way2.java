package xpathLocator_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
//	                        	Syntax 2-->> //tagname[text()='completeTextValue']
//		                           OR        //tagname[.='completeTextValue']
		String text = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']")).getText();
		System.out.println(text);
	}

}
