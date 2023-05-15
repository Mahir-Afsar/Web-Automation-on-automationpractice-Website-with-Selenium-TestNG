package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_005_EveningDressesPage extends CommonMethods{

	WebDriver driver = null;
	public PO_005_EveningDressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "product-container")
	public WebElement productContainer;
	
	@FindBy(xpath = "//a[@title='Add to cart']/span")
	public WebElement addToCartButton;
	
	public String eveningDressPageTitle = "Evening Dresses - My Store";
	
	@Step("Product Add To The Cart")
	public void productAddToTheCart() {
		scrollToElement(driver, productContainer);
		hover(driver, productContainer);
//		clickElement(addToCartButton);
	}
	
}
