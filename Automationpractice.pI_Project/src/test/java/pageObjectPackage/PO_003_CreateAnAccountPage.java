package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_003_CreateAnAccountPage extends CommonMethods{
	WebDriver driver = null;
	public PO_003_CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement mrGenderId;
	
	@FindBy(xpath = "//input[@id='id_gender2']")
	public WebElement mrsGenderId;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement firstNameId;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	public WebElement lastNameId;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement passwordId;
	
	@FindBy(xpath = "//select[@id='days']")
	public WebElement daysId;
	
	@FindBy(xpath = "//select[@id='months']")
	public WebElement monthsId;
	
	@FindBy(xpath = "//select[@id='years']")
	public WebElement yearsId;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	public WebElement newsletterId;
	
	@FindBy(xpath = "//input[@id='optin']")
	public WebElement optinId;
	
	@FindBy(xpath = "//button[@id='submitAccount']")
	public WebElement submitButtonId;
	
	@FindBy(className = "page-subheading")
	public WebElement pageSubHeading;
	
	
	
	public String pageSubHeadingText = "CREATE AN ACCOUNT";
	
	@Step("Fill Personal Information To Register")
	public void fillPersonalInformation(String firstName, String lastName, String password, String day, String month, String year) {
		clickElement(driver, mrGenderId);	
		sendText(firstNameId, firstName);
		sendText(lastNameId, lastName);
		sendText(passwordId, password);
		selectItem(daysId, day);
		selectItem(monthsId, month);
		selectItem(yearsId, year);
//		clickElement(driver, newsletterId);
//		clickElement(driver, optinId);
		newsletterId.click();
		optinId.click();
	}
	
	@Step("Click On Register Button")
	public void clickOnRegisterButton() {
		clickElement(driver, submitButtonId);
	}
	
}
