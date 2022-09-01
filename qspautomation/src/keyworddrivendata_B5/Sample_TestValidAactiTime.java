package keyworddrivendata_B5;

import java.io.IOException;

import org.openqa.selenium.By;

public class Sample_TestValidAactiTime extends Sample_BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		Sample_BaseTest bt = new Sample_BaseTest();
		bt.openBrowser(); //open the browser
		
		Flib flib = new Flib();
		String username = flib.readPropertyFile("./data/config.properties", "username");
		String password = flib.readPropertyFile("./data/config.properties", "password");
		
		// valid login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		bt.closeBrowser(); //close browser
		
	}

}
