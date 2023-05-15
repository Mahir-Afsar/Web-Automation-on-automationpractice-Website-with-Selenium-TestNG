package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_004_MyAccountPage extends CommonMethods{
	
	WebDriver driver = null;
	
	public PO_004_MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]")
	public WebElement userName;
	
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	public WebElement logout;
	
	@Step("Sign Out Button")
	public void signoutButton() {
		clickElement(driver, logout);
	}
	
	
	
}
