package launchBrowser_01;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//		took the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser name, chrome or firefox");
		String browserValue = sc.nextLine();
		//		browserValue variable contains the name of the browser which is supposed to be open

		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// avoid Illigation exception
			driver=new ChromeDriver();// open chrome browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web application
			Thread.sleep(5000);// wait for 5 sec.
		}
		if (browserValue.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);

		} else
		{
			System.out.println("enter valid input");
		}

	}

}
