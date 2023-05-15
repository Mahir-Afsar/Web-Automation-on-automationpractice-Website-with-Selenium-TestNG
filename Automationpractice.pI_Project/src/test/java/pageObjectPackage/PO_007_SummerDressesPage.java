package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_007_SummerDressesPage extends CommonMethods{

	WebDriver driver = null;
	public PO_007_SummerDressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ul_layered_id_attribute_group_3")
	public WebElement colorContainer;
	
	@FindBy(id = "layered_id_attribute_group_8")
	public WebElement blueColor;
	
	@FindBy(className = "product-container")
	public WebElement summerDressContainer;
	
	@FindBy(xpath = "//div[@class='button-container']//a[@title='Add to cart']")
	public WebElement goToPrintSummerDress;
	
	@FindBy(xpath = "//button[@name='Submit']")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//form[@id='buy_block']")
	public WebElement formCart;
	
	public String summerDressPageTitle = "Summer Dresses - My Store";
	public String SummerDressesColorWhitePage = "Summer Dresses > Color White - My Store";
	
	
	@Step("Scroll To Product And Click On White Filter")
	public void scrollToProductAndClickOnFilter() {
//		scrollToElement(driver, colorContainer);
		clickElement(driver, blueColor);
	}
	@Step("Add To Cart Button of SummerDress")
	public void addToCartButtonSummerDress() {
		scrollToElement(driver, blueColor);
		hover(driver, summerDressContainer);
		clickElement(driver, goToPrintSummerDress);
	}
	
//	public void addToCartButtonSummerDress() {
//		scrollToElement(driver, formCart);
//		clickElement(addToCartButton);
//	}
}
