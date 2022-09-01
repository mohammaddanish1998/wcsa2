package methodsOfWebDriver_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//1
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/"); //2
		
		String curentUrl1 = driver.getCurrentUrl();//3
		System.out.println(curentUrl1);  //4
	}

}
