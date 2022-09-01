package pageObjectModel_POM_B7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration

	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(xpath="//a[contains(text(),'Actimind')]") private WebElement linkActiTime;
	@FindBy(xpath="//a[contains(text(),'License')]") private WebElement licenselink;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logoActiTime;


	//initialization/ right click and go to source and click on genrate constroctor using field and deselect all checkbox and click on generate Button.
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}// initElement help of we can get current address of webelement


	//utilization/       right click and go to source and click on generate getter and setter method and select only getter method and click on genrate button.
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getLinkActiTime() {
		return linkActiTime;
	}
	public WebElement getLicenselink() {
		return licenselink;
	}
	public WebElement getLogoActiTime() {
		return logoActiTime;
	}


	//operational method
	public void validLoginActiTime(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
	}

	public void invalidLoginActiTime(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();
	}

}
