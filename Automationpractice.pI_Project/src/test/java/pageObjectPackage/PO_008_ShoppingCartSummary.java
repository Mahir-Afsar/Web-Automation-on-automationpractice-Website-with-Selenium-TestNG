package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_008_ShoppingCartSummary extends CommonMethods{

	WebDriver driver = null;
	public PO_008_ShoppingCartSummary(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "cart_title")
	public WebElement cartTitle;
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
	public WebElement checkoutbutton;
	
	public String orderPageTitle = "Order - My Store";
	
	@Step("Scroll Up To Down")
	public void scrollToDown() {
		scrollUpToDown(driver);
	}
	
	@Step("Click On Checkout Button")
	public void clickOnCheckout() {
		clickElement(driver, checkoutbutton);
	}
	
	
}

