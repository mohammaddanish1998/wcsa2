package PRACTICE;

import org.openqa.selenium.chrome.ChromeDriver;
public class CloseBrowsers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();			//Open Browser
		driver.manage().window().maximize();			// 
		driver.get("https://www.Amazon.com");			// URL
		Thread.sleep(6000);  							//Delay 6 sec.
		driver.close();   								//close the browser
		}

}
