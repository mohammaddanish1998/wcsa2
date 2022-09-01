package windowBased_POPUP_A5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleActiTime {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=2t8t2iulq6q95");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Logo & Color ')]")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(1000);
		
		WebElement doubleclick = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
//		Runtime.getRuntime().exec("/qspautomation/AutoIt_Files/FileUpload.exe");
		File  abs= new File("./AutoIt_Files/FileUpload2.exe‪C:\Users\fahim\Desktop\car1.jpg");
		String abspath = abs.getAbsolutePath();
		
		Runtime.getRuntime().exec(abspath);
		Thread.sleep(5000);
		Runtime.getRuntime().exec(abspath);
	
	}
}
