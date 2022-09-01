package webBased_POP_UP_A4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cleartrip_Clender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-start-maximized");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		
		driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Aug 06 2022']")).click();
		
		
		
		
		
		
	}
}
