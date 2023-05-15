package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_009_AddressPage extends CommonMethods{
	
	WebDriver driver = null;
	public PO_009_AddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement addressField;
	
	@FindBy(id = "city")
	public WebElement cityField;
	
	@FindBy(id = "id_state")
	public WebElement stateField;
	
	@FindBy(id = "postcode")
	public WebElement postCodeField;
	
	@FindBy(id = "phone")
	public WebElement phoneField;
	
	@FindBy(id = "phone_mobile")
	public WebElement phoneMobileField;
	
	@FindBy(className = "page-subheading")
	public WebElement MyAddress;
	
	@FindBy(id = "submitAddress")
	public WebElement clickOnSave;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	public WebElement proceedToCheckoutButton;
	
	public String addressPageTitle = "Address - My Store";
	
	@Step("Scroll To MyAddress")
	public void scrollToMyAddress() {
		scrollToElement(driver, MyAddress);
	}
	
	@Step("Scroll Up To Down MyAddress")
	public void scrollToDownMyAddress() {
		scrollUpToDown(driver);
	}
	
	@Step("Fill The Address Information")
	public void fillAddressInformation(String address,String city, String state, String zip, String homePhone, String mobilePhone) {
		sendText(addressField, address);
		sendText(cityField, city);
		selectItem(stateField, state);
		sendText(postCodeField, zip);
		sendText(phoneField, homePhone);
		sendText(phoneMobileField, mobilePhone);
	}
	
	@Step("Click On Save Button")
	public void clickOnSubmitButton() {
		clickElement(driver, clickOnSave);
	}
	
	@Step("Click On Proceed To Checkout Button")
	public void clickOnProceedToCheckoutButton() {
		clickElement(driver, proceedToCheckoutButton);
	}
	
	
	
	
}
