package keyworddrivendata_B5;

import java.io.IOException;

import org.openqa.selenium.By;

public class Sample_TestInvalidActiTime extends Sample_BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Sample_BaseTest bt = new Sample_BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataAct.xlsx", "invalidcreds");
		for (int i = 1; i <= rc; i++)
		{
			String usernane = flib.readExcelData("./data/TestDataAct.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/TestDataAct.xlsx", "invalidcreds", i, 1);
			System.out.println(i);
			
			driver.findElement(By.name("username")).sendKeys(usernane);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
			
		}
		
		
	}
}
