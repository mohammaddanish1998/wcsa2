package pageObjectModel_POM_B7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(name = "usersSelector.selectedUser") private WebElement interTimeTrackDropDown;
	@FindBy(xpath = "//a[contains(text(),'Create')]") private WebElement createNewTaskLink;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(xpath = "//a[contains(text(),'Logout')]") private WebElement logOutLink;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getInterTimeTrackDropDown() {
		return interTimeTrackDropDown;
	}
	
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}
	
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	
	// operational method
	public void logoutActiTime()
	{
		logOutLink.click();
	}
}
