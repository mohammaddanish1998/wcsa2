package Exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//due to wrong xpath and net slow--->> ./drivers/chromedriver.exe
		
	}

}
