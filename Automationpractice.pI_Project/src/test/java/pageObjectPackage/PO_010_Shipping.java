package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_010_Shipping extends CommonMethods{

	WebDriver driver = null;
	public PO_010_Shipping(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='cgv']")
	public WebElement termsOfService;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	public WebElement checkoutButton;
	
	@FindBy(xpath = "//p[@class='payment_module']//a[@title='Pay by check.']")
	public WebElement paymentModulePayByCheck; 
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	public WebElement confirmMyOrder;
	
	@Step("Click On Delivery Option")
	public void clickOnDeliveryOption() {
		termsOfService.click();
	}
	
	@Step("Scroll Up To Down On ShippingPage")
	public void scrollToDownShippingPage() {
		scrollUpToDown(driver);
	}
	
	@Step("Click On Processed To Checkout")
	public void clickOnProcessedToCheckout() {
		clickElement(driver, checkoutButton);
	}
	
	@Step("Click On PaymentModule")
	public void clickOnPaymentModule() {
		clickElement(driver, paymentModulePayByCheck);
	}
	
	@Step("Click On Confirm MyOrder")
	public void clickOnConfirmMyOrder() {
		clickElement(driver, confirmMyOrder);
	}
	
	
}
