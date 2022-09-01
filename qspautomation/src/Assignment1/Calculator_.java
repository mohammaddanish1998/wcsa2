package Assignment1; ///Done

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator_ {		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onClick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
//		'+driver+' jugad some time use +,-,*,/
		
		driver.findElement(By.xpath("//span[@onClick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		String result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(result);
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
