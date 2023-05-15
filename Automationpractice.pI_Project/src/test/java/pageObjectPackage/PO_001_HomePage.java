package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_001_HomePage extends CommonMethods{
	WebDriver driver = null;
	public PO_001_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public WebElement signInButton;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	public WebElement dressesHover;
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	public WebElement casualDressesButton;
	
	@FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
	public WebElement summerDressesButton;
	
	@Step("click On Sign In Button")
	public void clickSignInButton() {
		signInButton.click();
	}
	
	@Step("Hover And Click On CasualDresses")
	public void hoverAndClickCasualDresses() {
		hover(driver, dressesHover);
		clickElement(driver,casualDressesButton);
	}
	
	@Step("Hover And Click On SummerDresses")
	public void hoverAndClickSummerDresses() {
		hover(driver, dressesHover);
		clickElement(driver,summerDressesButton);
	}
	
	
}
