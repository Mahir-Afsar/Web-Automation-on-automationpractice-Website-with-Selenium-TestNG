package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_006_CartPage extends CommonMethods{

	WebDriver driver = null;
	public PO_006_CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "span[title='Continue shopping'] span:nth-child(1)")
	public WebElement continueShoppingButton;
	
	@FindBy(xpath = "//div[@class='button-container']//a[@title='Proceed to checkout']//span")
	public WebElement proceedToCheckoutButton;
	
	@Step("Click On Continue Shopping")
	public void clickContinueShopping() {
		clickElement(driver, continueShoppingButton);
	}
	
	@Step("Click On proceed To Checkout")
	public void clickOnproceedToCheckout() {
		clickElement(driver, proceedToCheckoutButton);
	}
	
	
}
