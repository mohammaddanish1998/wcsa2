package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=tcs&rlz=1C1CHBF_enIN977IN977&oq=tcs&aqs=chrome..69i57j46i67i199i433i465j0i131i433j0i433i512j0i131i433i512l3j0i67j0i433i512j0i512.843j0j15&sourceid=chrome&ie=UTF-8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@class='l'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.name("loginID")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("loginIDPasswrd")).sendKeys("Abcd@07");
		driver.findElement(By.xpath("//div[@style='margin-bottom: 10px;']")).click();
											//button[@class='greenButton']
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.=' Logout']")).click();
	}                                
}